package com.github.danlangford.dicefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DiceApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("DiceFX");
        stage.show();
    }

    public static void main(String...args){
        launch(args);
    }

}
