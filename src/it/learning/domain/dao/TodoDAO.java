package it.learning.domain.dao;

import it.learning.domain.model.Todo;
import it.learning.utils.Database;
import java.util.List;
import java.util.Optional;

public class TodoDAO implements CrudDAO<Todo, String> {

    @Override
    public void create(Todo todo) {

        Database database = Database.getInstance();
        List<Todo> items = database.getItems();

        items.add(todo);

        database.setItems(items);
    }

    @Override
    public void delete(Todo todo) {

        Database database = Database.getInstance();
        List<Todo> items = database.getItems();
        items.remove(todo);
        database.setItems(items);

    }

    @Override
    public void update(Todo todo) {

        Database database = Database.getInstance();
        List<Todo> items = database.getItems();

        int index = items.indexOf(todo);
        Todo storedTodo = items.get(index);

        storedTodo.setTitle(todo.getTitle());
        storedTodo.setContents(todo.getContents());

        database.setItems(items);

    }

    @Override
    public List<Todo> fetchAll() {

        Database database = Database.getInstance();
        List<Todo> items = database.getItems();

        return items;
    }

    @Override
    public Todo fetchOne(String s) {

        Database database = Database.getInstance();
        List<Todo> items = database.getItems();

        Optional<Todo> todoOptional = items.stream().filter(todo -> todo.getId() != s).findFirst();

        if (todoOptional.isPresent()) {
            return todoOptional.get();
        }
        return  null;
    }
}
