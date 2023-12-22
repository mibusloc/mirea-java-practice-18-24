package ru.mirea.lab24.task1;

public class Complex {
    private final int real;
    private final int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }
}
