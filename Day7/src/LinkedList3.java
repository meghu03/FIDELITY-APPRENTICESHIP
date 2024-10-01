//Insert a node at a specific position
import java.util.Scanner;
public class LinkedList3 {
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

    public LinkedList3() {
        head = null;
        size = 0;
    }

    public void addAt(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public String display() {
        Node temp = head;
        String res = "";
        while (temp != null) {
            res += temp.data;
            if (temp.next != null) {
                res += "->";
            }
            temp = temp.next;
        }
        return res;
    }
    private Node getNodeAt(int position) {
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList3 ll = new LinkedList3();
        System.out.println("Enter the initial values for the linked list ");
        ll.addAt(sc.nextInt(), 0);
        ll.addAt(sc.nextInt(), 1);
        ll.addAt(sc.nextInt(), 2);
        String initialList = ll.display();
        System.out.println("The initial linked list is: " + initialList);
        System.out.print("Insert a value and a position: ");
        int valueToInsert = sc.nextInt();
        int position = sc.nextInt();
        ll.addAt(valueToInsert, position);
        String updatedList = ll.display();
        System.out.println("Insert " + valueToInsert + " at position " + position +
                " which currently has " + (position < ll.size ? ll.getNodeAt(position).data : "N/A") + " in it.");
        System.out.println("The updated linked list is: " + updatedList);
        sc.close();
    }
}
