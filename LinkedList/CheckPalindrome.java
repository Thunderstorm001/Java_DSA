public class CheckPalindrome {
    // ex 1->2->2->1
    // slow fast concept
    // reverse half Linklist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    /*
     * steps:1 find mid ---> By Slow Fast technique
     * step 2 : revese 2 nd half of Linked list
     * step 3 : check if 1 st half == 2nd half
     */

    // slow fast algorithm
    public static boolean CheckPalindrome() {
        if (head == null || head.next == null)
            return true;
        // find middle
        Node midNode = Findmid(head);
        // reverse 2 nd part
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static Node Findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next == null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// which will be mid
    }

    public static void main(String[] args) {

        CheckPalindrome ll = new CheckPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        print();
        System.out.println(CheckPalindrome());
        ;
        // print();
    }

    public static void addFirst(int data) {
        // step 1:create
        Node newnode = new Node(data);
        if (head == null)// base case
        {
            head = tail = newnode;
            return;
        }
        // size++;
        // step 2:
        newnode.next = head;
        head = newnode;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // size++;
        System.out.println();
    }
}
