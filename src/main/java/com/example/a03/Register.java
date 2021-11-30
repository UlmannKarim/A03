package com.example.a03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Register extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("CS3318 A03");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}