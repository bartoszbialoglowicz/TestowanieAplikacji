package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void testAddTask() {
        toDoList.addTask("Task 1");
        List<Task> tasks = toDoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Task 1", tasks.get(0).getName());
        assertFalse(tasks.get(0).isDone());
    }

    @Test
    void testRemoveTask() {
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");

        toDoList.removeTask("Task 1");

        List<Task> tasks = toDoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Task 2", tasks.get(0).getName());
    }

    @Test
    void testRemoveTaskThrowsException() {
        toDoList.addTask("Task 1");

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            toDoList.removeTask("Nonexistent Task");
        });

        assertEquals("Task not found", exception.getMessage());
    }

    @Test
    void testMarkTaskAsDone() {
        toDoList.addTask("Task 1");

        toDoList.markTaskAsDone("Task 1");

        Task task = toDoList.getTasks().get(0);
        assertTrue(task.isDone());
    }

    @Test
    void testMarkTaskAsDoneThrowsException() {
        toDoList.addTask("Task 1");

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            toDoList.markTaskAsDone("Nonexistent Task");
        });

        assertEquals("Task not found", exception.getMessage());
    }

    @Test
    void testUnmarkTaskAsDone() {
        toDoList.addTask("Task 1");
        toDoList.unmarkTaskAsDone("Task 1");
    }
}