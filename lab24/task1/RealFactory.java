package ru.mirea.lab24.task1;

public class RealFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imag) {
        return new Complex(real, imag);
    }
}
