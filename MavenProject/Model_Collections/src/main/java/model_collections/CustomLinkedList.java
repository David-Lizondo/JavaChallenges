package model_collections;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    
    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                
                return null;
            }

            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
