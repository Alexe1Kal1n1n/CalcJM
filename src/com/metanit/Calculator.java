package com.metanit;

public class Calculator {

    public static int calculate(int number1, int number2, char operation) {
        int result = 0;

        if (operation == '+') {
            result = number1 + number2;
            return result;
        } else if (operation == '*') {
            result = number1 * number2;
            return result;
        } else if (operation == '-') {
            result = number1 - number2;
            return result;
        } else if (operation == '/') {
            result = number1 / number2;
            return result;
        } else {
            System.out.println("Error");
            return result;


        }
    }
}