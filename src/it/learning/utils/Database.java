package it.learning.utils;

import it.learning.domain.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database uniqueInstance = null;

    private List<Todo> items;

    public static Database getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Database();
        }
        return uniqueInstance;
    }

    private Database() {
        this.items = new ArrayList<>();
    }

    public void setItems(List<Todo> items) {
        this.items = items;
    }

    public List<Todo> getItems() {
        return items;
    }
}
