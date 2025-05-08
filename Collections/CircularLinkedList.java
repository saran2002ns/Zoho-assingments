public class CircularLinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    public T remove() {
        if (head == null)
            throw new RuntimeException("List is empty");
        T data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return data;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public int size() {
        return size;
    }
}
