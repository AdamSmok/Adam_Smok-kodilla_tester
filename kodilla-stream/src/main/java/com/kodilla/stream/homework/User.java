package com.kodilla.stream.homework;

import java.util.Objects;

public class User {
    private String username = null;
    private int age = 0;
    private int numberOfPosts = 0;
    private String group = null;

    public User(String username, int age, int numberOfPosts, String group) {
        this.username = username;
        this.group = group;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
    }

    public String getUsername() {
        return username;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && numberOfPosts == user.numberOfPosts && Objects.equals(username, user.username) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, group, age, numberOfPosts);
    }
}