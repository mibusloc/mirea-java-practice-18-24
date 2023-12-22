package ru.mirea.lab20.task1;

public class GenericClass<T, V, K> {
    private T firstParameter;
    private V secondParameter;
    private K thirdParameter;

    public GenericClass(T firstParameter, V secondParameter, K thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public void setThirdParameter(K thirdParameter) {
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
    
    public void displayParameters() {
        System.out.println("First Parameter: " + firstParameter);
        System.out.println("Second Parameter: " + secondParameter);
        System.out.println("Third Parameter: " + thirdParameter);
    }

    public static void main(String[] args) {
        GenericClass<Integer, String, Double> example = new GenericClass<>(10, "Hello", 3.14);
        example.displayParameters();
    }
}

