package collectionsPart2;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;

    // Constructor
    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Método para agregar un elemento al final de la lista
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

    // Implementación del iterador
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    // Puedes manejar esto según tus necesidades (lanzar una excepción, etc.)
                    return null;
                }

                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    // Clase interna para representar los nodos de la lista
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}