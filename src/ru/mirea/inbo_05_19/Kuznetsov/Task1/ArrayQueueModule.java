package ru.mirea.inbo_05_19.Kuznetsov.Task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];

    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[size++] = element;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = Arrays.copyOf(elements, 2 * capacity);
        }
    }

    public static Object dequeue() {
        assert size > 0;
        return elements[--size];
    }

    public static Object element() {
        assert size > 0;
        return elements[size - 1];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}