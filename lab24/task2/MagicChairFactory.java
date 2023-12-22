package ru.mirea.lab24.task2;

class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
