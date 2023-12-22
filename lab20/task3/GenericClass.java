package ru.mirea.lab20.task3;

import java.io.Serializable;


public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T firstParameter;
    private final V secondParameter;
    private final K thirdParameter;

    public GenericClass(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public T getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public void displayClassNames() {
        System.out.println("Class name for first parameter: " + firstParameter.getClass().getName());
        System.out.println("Class name for second parameter: " + secondParameter.getClass().getName());
        System.out.println("Class name for third parameter: " + thirdParameter.getClass().getName());
    }

    public void displayParameters() {
        System.out.println("First Parameter: " + firstParameter);
        System.out.println("Second Parameter: " + secondParameter);
        System.out.println("Third Parameter: " + thirdParameter);
    }

    public static void main(String[] args) {
        GenericClass<Integer, AnimalClass, Double> example = new GenericClass<>(10, new AnimalClass(), 3.14);
        example.displayParameters();
        example.displayClassNames();
    }
}

