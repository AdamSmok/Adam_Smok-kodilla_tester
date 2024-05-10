package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ForumStatsTest {

    @Test
    public void testGetAvgPostCountGroup1() {
        List<User> testUsers = Arrays.asList(
                new User("User1", 30, 5, "Sales"),
                new User("User2", 35, 8, "Manager"),
                new User("User3", 40, 10, "Board")
        );

        double expectedAvg = (5 + 8 + 10) / 3.0; // Average = Sum of post counts / Number of users
        double actualAvg = ForumStats.getAvgPostCountGroup1(testUsers, 40);
        assertEquals(expectedAvg, actualAvg, 0.01); // Allowing a small delta for double comparison
    }

    @Test
    public void testGetAvgPostCountGroup2() {
        List<User> testUsers = Arrays.asList(
                new User("User4", 45, 15, "Chemists"),
                new User("User5", 50, 20, "Security"),
                new User("User6", 55, 25, "Chemists")
        );

        double expectedAvg = (15 + 20 + 25) / 3.0; // Average = Sum of post counts / Number of users
        double actualAvg = ForumStats.getAvgPostCountGroup2(testUsers, 40);
        assertEquals(expectedAvg, actualAvg, 0.01); // Allowing a small delta for double comparison
    }
}
