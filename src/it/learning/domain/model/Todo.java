package it.learning.domain.model;

import java.util.UUID;

public class Todo {

    private String id;

    private String title;

    private String contents;

    public Todo(String id) {
        this.id = id;
        this.title = "";
        this.title = "";
    }

    public Todo() {
        this(UUID.randomUUID().toString());
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
