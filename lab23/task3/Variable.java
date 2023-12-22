package ru.mirea.lab23.task3;

class Variable extends Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int evaluate(int x) {
        return x;
    }
}