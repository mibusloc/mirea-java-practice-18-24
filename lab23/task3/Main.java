package ru.mirea.lab23.task3;

public class Main {
    public static void main(String[] args) {
        // Выражение: (2 * x) - 3, где x = 5
        Expression expression = new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3));
        int result = expression.evaluate(5);

        System.out.println("Результат при x = 5: " + result);
    }
}