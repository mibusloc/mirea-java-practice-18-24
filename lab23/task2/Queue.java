package ru.mirea.lab23.task2;

public interface Queue<E> {
    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
}