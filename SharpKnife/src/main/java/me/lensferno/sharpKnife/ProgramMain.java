package me.lensferno.sharpKnife;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProgramMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader;
        Parent parent;

        try {
            fxmlLoader = new FXMLLoader(getClass().getResource("/me/lensferno/sharpKnife/FXML/MainUI.fxml"));
            parent = fxmlLoader.load();
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
            return;
        }

        Scene scene = new Scene(parent,600,307);
        primaryStage.setTitle("sharp knife");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    static void main(String[] args) {
        launch(args);
    }

}
