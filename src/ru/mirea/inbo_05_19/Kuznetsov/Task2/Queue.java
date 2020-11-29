package ru.mirea.inbo_05_19.Kuznetsov.Task2;

public interface Queue {
    void enqueue(Object element);

    Object dequeue();

    Object element();

    int size();

    boolean isEmpty();

    void clear();
}