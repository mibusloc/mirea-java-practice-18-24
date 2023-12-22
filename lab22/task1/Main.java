package ru.mirea.lab22.task1;

public class Main {
    public static void main(String[] args) {
        String[] expression = {"3", "4", "+", "2", "*"};
        double result = Calculator.evaluateRPN(expression);
        System.out.println("Результат: " + result);
    }
}
