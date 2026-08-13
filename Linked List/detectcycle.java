import java.util.*;

public class detectcycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean hasCycle(Node head) {

        HashSet<Node> visited = new HashSet<>();  //means the HashSet stores Node objects

        Node temp = head;

        while (temp != null) {

            if (visited.contains(temp)) {
                return true;
            }

            visited.add(temp);
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Create cycle: 4 → 2
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}