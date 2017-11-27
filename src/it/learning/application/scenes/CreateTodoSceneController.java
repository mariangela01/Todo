package it.learning.application.scenes;

import it.learning.domain.dao.TodoDAO;
import it.learning.domain.model.Todo;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateTodoSceneController {

    @FXML
    TextField titleTextField;

    @FXML
    TextArea contentsTextArea;


    @FXML
    private void onSaveAction() {

        if (titleTextField.textProperty().get().trim().length() <= 0) {
            return;
        }

        Todo todo = new Todo();
        todo.setTitle(titleTextField.textProperty().get());
        todo.setContents(contentsTextArea.textProperty().get());

        TodoDAO todoDAO = new TodoDAO();
        todoDAO.create(todo);
        close();
    }

    @FXML
    private void onCancelAction() {
        close();
    }

    private void close() {
        Stage stage = (Stage) titleTextField.getScene().getWindow();
        stage.close();
    }
}
