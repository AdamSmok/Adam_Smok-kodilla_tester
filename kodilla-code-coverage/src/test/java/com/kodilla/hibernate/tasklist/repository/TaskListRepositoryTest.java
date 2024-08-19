package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TaskListRepositoryTest {

    @Autowired
    private TaskListRepository taskListRepository;

    @BeforeEach
    public void setup() {
        // Wprowadzenie przykładowych danych do bazy danych przed każdym testem
        TaskList taskList1 = new TaskList("List1", "First list description");
        TaskList taskList2 = new TaskList("List2", "Second list description");
        taskListRepository.save(taskList1);
        taskListRepository.save(taskList2);
    }

    @AfterEach
    public void cleanup() {
        // Czyszczenie bazy danych po każdym teście
        taskListRepository.deleteAll();
    }

    @Test
    void testFindByListName() {
        // Given
        String listName = "List1";

        // When
        List<TaskList> foundTaskLists = taskListRepository.findByListName(listName);

        // Then
        assertEquals(1, foundTaskLists.size());
        assertEquals(listName, foundTaskLists.get(0).getListName());
    }
}
