package org.example;

import java.util.ArrayList;

public class User {

    private ArrayList<ToDoItem> toDoItems;

    public User(String username, String password) {
        this.toDoItems = new ArrayList<>();
    }

    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }
}