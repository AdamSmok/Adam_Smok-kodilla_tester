package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();

        // Czy lista nie jest pusta
        Assertions.assertFalse(chemistGroupUsernames.isEmpty(), "Lista nie powinna być pusta");

        // Czy każde username z listy jest niepuste
        Assertions.assertTrue(chemistGroupUsernames.stream().allMatch(username -> !username.isEmpty()), "Każde username powinno być niepuste");

        // Czy lista zawiera oczekiwane username
        Assertions.assertTrue(chemistGroupUsernames.contains("Walter White"), "Brakuje użytkownika Walter White");
        Assertions.assertTrue(chemistGroupUsernames.contains("Gale Boetticher"), "Brakuje użytkownika Gale Boetticher");

        // Czy lista nie zawiera username spoza grupy Chemists
        Assertions.assertFalse(chemistGroupUsernames.contains("Jessie Pinkman"), "Niepowinien być użytkownik Jessie Pinkman");
        Assertions.assertFalse(chemistGroupUsernames.contains("Tuco Salamanca"), "Niepowinien być użytkownik Tuco Salamanca");
        Assertions.assertFalse(chemistGroupUsernames.contains("Gus Firing"), "Niepowinien być użytkownik Gus Firing");
        Assertions.assertFalse(chemistGroupUsernames.contains("Mike Ehrmantraut"), "Niepowinien być użytkownik Mike Ehrmantraut");
    }

    @Test
    public void testFilterUsersContainingString() {
        String searchString = "man";
        List<User> usersContainingString = UsersManager.filterUsersContainingString(searchString);

        // Czy lista nie jest pusta
        Assertions.assertFalse(usersContainingString.isEmpty(), "Lista nie powinna być pusta");

        // Czy każdy użytkownik w liście zawiera w nazwie searchString
        Assertions.assertTrue(usersContainingString.stream().allMatch(user -> user.getUsername().toLowerCase().contains(searchString)),
                "Każdy użytkownik powinien zawierać w nazwie " + searchString);
    }
}