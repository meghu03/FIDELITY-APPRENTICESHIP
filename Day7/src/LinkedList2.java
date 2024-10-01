//Inserting a node at the head of the linked list

import java.util.Scanner;
public class LinkedList2 {
    private Node head;
    private int size;
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList2() {
        head = null;
        size = 0;
    }
    public void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        size++;
        display();
    }

    public void display() {
        Node temp = head;
        String res = "";
        while (temp != null) {
            res += temp.data;
            if (temp.next != null) {
                res += " -> ";
            }
            temp = temp.next;
        }
        res += " -> NULL";
        System.out.println("The linked list is: " + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the linked list: ");
        int n = sc.nextInt();
        LinkedList2 ll = new LinkedList2();
        System.out.println("Enter " + n + " data values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addFirst(data);
        }
        System.out.println("Final linked list:");
        ll.display();
        sc.close();
    }
}
