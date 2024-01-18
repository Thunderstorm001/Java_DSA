public class findNthRemovefromEnd {
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

    // nth from end = size-n-1th
    public void deleteNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        // size-n
        int i = 1;
        int iTofind = size - n;
        Node prev = head;
        //go to prev of req
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;//pointing step 
        return;
    }

    public static void addFirst(int data) {
        // step 1:create
        Node newnode = new Node(data);
        if (head == null)// base case
        {
            head = tail = newnode;
            return;
        }
        //size++;
        // step 2:
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args) {

        findNthRemovefromEnd ll = new findNthRemovefromEnd();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        print();
        ll.deleteNthfromEnd(2);
        print();
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        //size++;
        System.out.println();
    }

}
