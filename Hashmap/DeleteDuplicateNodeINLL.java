 import java.util.HashMap;
 public class  DeleteDuplicateNodeINLL {

    static class ListNode 
    {
    int val;
    ListNode next;

    ListNode(int val) 
    {
        this.val = val;
        this.next = null;
    }
    }
    public static void removeDuplicates(ListNode head) {
        if (head == null)
            return;

        HashMap<Integer, Boolean> map = new HashMap<>();
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (map.containsKey(current.val)) {
                prev.next = current.next; // Remove duplicate node
            } else {
                map.put(current.val, true); // Add value to the map
                prev = current;
            }
            current = current.next;
        }
    }

    // Helper function to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an unsorted linked list: 1 -> 2 -> 1 -> 3 -> 2 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        removeDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printLinkedList(head);
    }


}
