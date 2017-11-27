package it.learning.application.scenes;

import it.learning.application.scenes.ListSceneController;
import it.learning.domain.model.Todo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController  {

    private Stage previousStage;

    @FXML
    private ListSceneController listSceneController;

    @FXML
    private void showCreateScene() throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("create_scene.fxml"));
        Parent root = loader.load();
        CreateTodoSceneController controller = (CreateTodoSceneController) loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.DECORATED);
        stage.initOwner(previousStage);

        stage.setTitle("Create new todo");
        stage.setScene(scene);
        stage.showAndWait();

        listSceneController.reload();

    }



    public void setPreviousStage(Stage previousStage) {
        this.previousStage = previousStage;
    }

}
