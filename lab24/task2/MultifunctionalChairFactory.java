package ru.mirea.lab24.task2;

class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
