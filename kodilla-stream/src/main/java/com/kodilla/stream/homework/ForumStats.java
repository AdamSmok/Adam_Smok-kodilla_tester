package com.kodilla.stream.homework;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        int groupSeparationAge = 40;
        List<User> users = UsersRepository.getUsersList();

        System.out.printf("Average number of posts in group 1: "+ getAvgPostCountGroup1(users, groupSeparationAge));
        System.out.printf("\nAverage number of posts in group 2: "+ getAvgPostCountGroup2(users, groupSeparationAge));
    }

    public static double getAvgPostCountGroup1(List<User> users, int groupSeparationAge) {
        double avgPostCountGroup1 = users.stream()
                .filter(u -> u.getAge() <= groupSeparationAge)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
        return avgPostCountGroup1;
    }

    public static double getAvgPostCountGroup2(List<User> users, int groupSeparationAge) {
        double avgPostCountGroup2 = users.stream()
                .filter(u -> u.getAge() > groupSeparationAge)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
        return avgPostCountGroup2;
    }
}