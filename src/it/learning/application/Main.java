package it.learning.application;

import it.learning.application.scenes.MainSceneController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scenes/main_scene.fxml"));

        Parent root = loader.load();
        MainSceneController controller = (MainSceneController) loader.getController();

        controller.setPreviousStage(primaryStage);

        primaryStage.setTitle("Todo application");
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
