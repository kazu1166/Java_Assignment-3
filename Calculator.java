package com.example.demo2_intellij;

public class Calculator {

    // Method to process the input string, trim spaces, split into an array, and calculate the average
    public static double calculateAverage(String input) {
        // Trim the string to remove leading and trailing spaces
        String trimmedNumbers = input.trim();

        // Split the string into an array using space as the delimiter
        String[] numberStrings = trimmedNumbers.split(" ");

        // Convert the string array to a double array
        double[] numberArray = new double[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numberArray[i] = Double.parseDouble(numberStrings[i]);
        }

        // Calculate the sum of the array
        double sum = arraySum(numberArray);

        // Get the number of elements in the array
        int count = numberArray.length;

        // Calculate and return the average
        return sum / count;
    }

    // Method to calculate the sum of a double array
    private static double arraySum(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum;
    }
}