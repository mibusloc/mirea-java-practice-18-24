package ru.mirea.lab23.task3;

class Const extends Expression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    int evaluate(int x) {
        return value;
    }
}