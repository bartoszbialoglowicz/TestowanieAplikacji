package org.example;

public class Task {
    private String name;
    private boolean done;

    public Task(String name) {
        this.name = name;
        this.done = false;
    }

    public void markAsDone() {
        this.done = true;
    }
    public void unmarkAsDone() {
        this.done = false;
    }
    public boolean isDone() {
        return this.done;
    }
    public String getName() {
        return this.name;
    }
}
