// Inserting a node at the tail of the linked list
import java.util.Scanner;
public class LinkedList1 {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList1() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
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
        LinkedList1 ll = new LinkedList1();
        System.out.println("Enter " + n + " data values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            ll.addLast(data);
        }
        System.out.println("Final linked list:");
        ll.display();
        sc.close();
    }
}
