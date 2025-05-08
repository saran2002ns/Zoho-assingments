public class DoublyLinkedList<T> {
    private class Node {
        T data;
        Node prev;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void addLast(T data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null)
            throw new RuntimeException("List is empty");
        T data = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        size--;
        return data;
    }

    public T removeLast() {
        if (tail == null)
            throw new RuntimeException("List is empty");
        T data = tail.data;
        tail = tail.prev;
        if (tail != null)
            tail.next = null;
        else
            head = null;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}