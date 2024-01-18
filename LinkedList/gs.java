//package LinkedList;

public class gs {
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
    static public int size;

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

    public static void addLast(int data) {
        // step 1:create
        Node newnode = new Node(data);
        size++;
        if (head == null)// base case
        {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
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

    public static void Add(int idx, int j) {
        Node newnode = new Node(j);
        if (idx == 0) {
            addFirst(j);
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // now ptr is at idx -1
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static int removefirst() {
        if (size == 0) {
            System.out.println("invalid --> LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
         else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {

        gs ll = new gs();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(3);

        print();
        ll.removefirst();
        print();
        ll.removeLast();
        print();
        System.out.println(size);
    }
}
