package com.kodilla.jdbc;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTest {
    private static DbManager dbManager;
    private static Connection dbConnection;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
        dbConnection = dbManager.getConnection();
    }

    @AfterAll
    public static void tearDown() {
        try {
            if (dbConnection != null && !dbConnection.isClosed()) {
                dbConnection.close();
                System.out.println("Database connection closed successfully.");
            }
        } catch (SQLException e) {
            System.err.println("An error occurred while closing the database connection.");
            e.printStackTrace();
        }
    }

    @Test
    void testConnect() {
        // Given
        // When
        // Then
        Assertions.assertNotNull(dbConnection, "Database connection should not be null.");
        try {
            Assertions.assertTrue(dbConnection.isValid(2), "Database connection should be valid.");

            String query = "SELECT DATABASE()";
            Statement statement = dbConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            Assertions.assertTrue(resultSet.next(), "Failed to retrieve the database name.");
            String databaseName = resultSet.getString(1);
            System.out.printf("Connected to database: %s%n", databaseName);

            DatabaseMetaData metaData = dbConnection.getMetaData();
            System.out.printf("Database Product Name: %s%n", metaData.getDatabaseProductName());
            System.out.printf("Database Product Version: %s%n", metaData.getDatabaseProductVersion());
            System.out.printf("Driver Name: %s%n", metaData.getDriverName());
            System.out.printf("Driver Version: %s%n", metaData.getDriverVersion());

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            Assertions.fail("An SQL exception occurred during the test connection.", e);
        }
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // Given
        String query =
                "SELECT u.FIRSTNAME, u.LASTNAME " +
                        "FROM users u " +
                        "JOIN posts p ON u.ID = p.USER_ID " +
                        "GROUP BY u.ID " +
                        "HAVING COUNT(p.ID) >= 2";

        System.out.println("Fetching users who have published at least two posts:");

        Statement statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        // Then
        int counter = 0;
        while (rs.next()) {
            String firstName = rs.getString("FIRSTNAME");
            String lastName = rs.getString("LASTNAME");
            System.out.printf("User: %s %s%n", firstName, lastName);
            counter++;
        }

        // Print the total number of users found
        System.out.printf("Total number of users with at least two posts: %d%n", counter);

        // Assertion to verify the number of users with at least two posts
        String countQuery =
                "SELECT COUNT(*) " +
                        "FROM ( " +
                        "    SELECT u.ID " +
                        "    FROM users u " +
                        "    JOIN posts p ON u.ID = p.USER_ID " +
                        "    GROUP BY u.ID " +
                        "    HAVING COUNT(p.ID) >= 2 " +
                        ") AS subquery";

        Statement countStatement = dbConnection.createStatement();
        ResultSet countResultSet = countStatement.executeQuery(countQuery);
        countResultSet.next();
        int expectedCount = countResultSet.getInt(1);

        Assertions.assertEquals(expectedCount, counter, "The number of users with at least two posts does not match the expected count.");

        rs.close();
        countResultSet.close();
        statement.close();
        countStatement.close();
    }
}
