package ru.mirea.lab23.task3;

class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}