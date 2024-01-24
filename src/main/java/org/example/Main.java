package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static boolean checkEven(int number){
        return number % 2 == 0;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String convertUppercase(String word){
        return word.toUpperCase();
    }

    public static Boolean checkPositive(int number){
        return number>0;
    }
}