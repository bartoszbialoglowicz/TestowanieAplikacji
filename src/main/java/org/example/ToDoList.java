package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    private Task getTask(String name) {
        return tasks.stream().filter(task -> task.getName().equals(name)).findFirst().orElse(null);
    }

    public ToDoList() {
        tasks = new ArrayList<Task>();
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public void addTask(String taskName) {
        tasks.add(new Task(taskName));
    }
    public void removeTask(String taskName) {
        Task task = getTask(taskName);
        if (task == null) {
            throw new RuntimeException("Task not found");
        }
        tasks.remove(task);
    }
    public void markTaskAsDone(String taskName) {
        Task task = getTask(taskName);
        if (task == null) {
            throw new RuntimeException("Task not found");
        }
        task.markAsDone();
    }
    public void unmarkTaskAsDone(String taskName) {
        Task task = getTask(taskName);
        if (task == null) {
            throw new RuntimeException("Task not found");
        }
        task.unmarkAsDone();
    }
}
