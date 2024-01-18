public class ReverseLinkList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        // step 1:create
        Node newnode = new Node(data);
        if (head == null)// base case
        {
            head = tail = newnode;
            return;
        }
        size++;
        // step 2:
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args) {

        ReverseLinkList ll = new ReverseLinkList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        print();
        ll.reverse();
        print();
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        size++;
        System.out.println();
    }

    public static Node head;
    public static Node tail;
    static public int size;

    public static void reverse() {
        // start conditions
        Node prev = null;
        Node curr = head ;
        Node next;
        // Node tail=head=tail;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // update head
        head = prev;
    }
}
