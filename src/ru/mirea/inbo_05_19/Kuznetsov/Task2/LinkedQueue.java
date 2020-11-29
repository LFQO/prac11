package ru.mirea.inbo_05_19.Kuznetsov.Task2;

public class LinkedQueue {
    private int size;
    private Node head;

    public void enqueue(Object element) {
        assert element != null;
        size++;
        head = new Node(element, head);
    }

    public Object dequeue() {
        assert size > 0;
        size--;
        Object result = head.value;
        head = head.next;
        return result;
    }

    public Object element() {
        assert size > 0;
        return head.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    private class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            assert value != null;
            this.value = value;
            this.next = next;
        }
    }
}