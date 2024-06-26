import java.util.Scanner;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(TransaksiRental data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}