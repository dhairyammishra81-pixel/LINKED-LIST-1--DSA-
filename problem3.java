import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class problem3 {
    Node head;

    // Insert node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete all nodes with values greater than 25
    public void deleteNodesGreaterThan25() {
        // Handle deletion if the head nodes themselves are greater than 25
        while (head != null && head.data > 25) {
            head = head.next;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data > 25) {
                prev.next = current.next; // Bypass the node
            } else {
                prev = current; // Move prev only if node is kept
            }
            current = current.next;
        }
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        problem3 list = new problem3 ();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter numbers in the range 1-50:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val >= 1 && val <= 50) {
                list.insert(val);
            } else {
                System.out.println("Value out of range (1-50). Skipping " + val);
            }
        }

        System.out.println("\nOriginal Linked List:");
        list.printList();

        list.deleteNodesGreaterThan25();

        System.out.println("Linked List after deleting nodes > 25:");
        list.printList();

        scanner.close();
    }
}
