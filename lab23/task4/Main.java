package ru.mirea.lab23.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String inputExpression = scanner.nextLine().replaceAll("\\s+","");

        ExpressionParser parser = new ExpressionParser(inputExpression);
        Expression expression = parser.parse();

        if (expression != null) {
            System.out.println(" x\tf");
            for (int x = 0; x <= 10; x++) {
                try {
                    int result = expression.evaluate(x);
                    System.out.println(" " + x + "\t" + result);
                } catch (ArithmeticException e) {
                    System.out.println(" " + x + "\t" + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}
