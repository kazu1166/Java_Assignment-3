package com.example.demo2_intellij;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("averageCalculator-view.fxml"));
            // need to modify screen size
            Scene scene = new Scene(fxmlLoader.load(), 400, 200);
            // title =>
            stage.setTitle("Average Calculator");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.err.println("Failed to load FXML file. Please check the file and try again.");
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        launch();
    }

}