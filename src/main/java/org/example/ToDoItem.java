package org.example;

public class ToDoItem {
    private String description;
    private boolean isDone;

    // constructor
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // getters
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    // setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}