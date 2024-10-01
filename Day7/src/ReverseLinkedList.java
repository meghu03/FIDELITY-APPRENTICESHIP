import java.util.Scanner;
class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class ReverseLinkedList {
    private ListNode head;
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseLinkedList ll = new ReverseLinkedList();
        System.out.print("Enter the size of the linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ll.add(value);
        }
        System.out.println("Original linked list:");
        ll.display();
        ll.reverse();
        System.out.println("Reversed linked list:");
        ll.display();
        sc.close();
    }
}
