package it.learning.application.scenes;

import it.learning.domain.dao.TodoDAO;
import it.learning.domain.model.Todo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSceneController {

    @FXML
    private ListView todoListView;


    public void initialize() {
        reload();
    }

    public void sayHello() {
        System.out.println("hello");
    }

    public void reload() {
        TodoDAO todoDAO = new TodoDAO();
        List<Todo> todos = new ArrayList<Todo>(todoDAO.fetchAll());
        ObservableList<String> observableList = FXCollections.observableArrayList(todos.stream().map( todo -> todo.getTitle() ).collect(Collectors.toList()));
        todoListView.setItems(observableList);
    }

}
