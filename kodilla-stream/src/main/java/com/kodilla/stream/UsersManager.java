package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println("List of chemics:");
        System.out.println(chemistGroupUsernames);
        int minAge = 35;
        System.out.println("\nUsers older than " + minAge + " years: ");
        for (User u : filterUsersOlderThan(minAge)) {
            System.out.println(u.getUsername() + " with age " + u.getAge());
        }
        String partOfName = "man";
        System.out.println("\nUsers with name matching '" + partOfName + "' :");
        for (User u : filterUsersContainingString(partOfName)) {
            System.out.println(u.getUsername());
        }
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)         // [1]
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterUsersOlderThan(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }

    public static List<User> filterUsersContainingString(String partOfName) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getUsername().toLowerCase().contains(partOfName.toLowerCase()))
                .collect(Collectors.toList());
        return users;
    }
}