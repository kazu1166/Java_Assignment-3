package com.example.demo2_intellij;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label answer;

    @FXML
    private TextField inputNumber;

    @FXML
    protected void onCalculateAvg() {
        try {
            String numbers = inputNumber.getText();

            // Calculate the average using the Calculator class
            double average = Calculator.calculateAverage(numbers);

            String strAverage = Double.toString(average);

            answer.setText("Average: " + strAverage);

        } catch (Exception e) {
            answer.setText("Invalid input! Please input numbers separated by single space.");

        }

    }
}