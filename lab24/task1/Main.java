package ru.mirea.lab24.task1;


public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new RealFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex Number 1: " + complex1);

        Complex complex2 = factory.createComplex(3, 5);
        System.out.println("Complex Number 2: " + complex2);
    }
}
