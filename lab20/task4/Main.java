package ru.mirea.lab20.task4;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 4};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        Double[] doubleArray = {3.5, 7.2, 1.8, 9.6, 4.3};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Min: " + doubleMinMax.findMin());
        System.out.println("Max: " + doubleMinMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 3.2));
        System.out.println("Multiply: " + Calculator.multiply(5, 3.2));
        System.out.println("Divide: " + Calculator.divide(5, 2));
        System.out.println("Subtraction: " + Calculator.subtraction(5, 3.2));
    }
}

