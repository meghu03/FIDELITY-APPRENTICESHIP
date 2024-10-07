import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void addAt(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void remove(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index or empty list.");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Index not found");
                return;
            }
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Index not found");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter 4 elements for the linked list:");
        for (int i = 0; i < 4; i++) {
            int data = sc.nextInt();
            linkedList.addAt(data);
        }
        linkedList.display();
        System.out.print("Enter the index of the element to remove: ");
        int indexToRemove = sc.nextInt();
        linkedList.remove(indexToRemove);
        linkedList.display();
        sc.close();
    }
}