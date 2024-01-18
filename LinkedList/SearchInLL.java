//package LinkedList;

//import org.w3c.dom.Node;

//iterative method ---linear search
public class SearchInLL {
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

    public static int search(int key)
    {
        Node temp = head;int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
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
    public static void main(String[] args)
    {

        SearchInLL ll = new SearchInLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        print();
        ll.reverse();
        print();
       // System.out.println(SearchInLL.search(1));
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

    public static int helper(Node head,int key)
    {
        if(head==null)
        return -1;

        if(head.data==key)
        {
            return 0;
        }
        int idx=helper(head.next,key);
        return idx+1;
    }
    public static int recsearch(int key)
    {
        return helper(head,key);
    }
    public static void reverse() {
        // start conditions
        Node prev = null;
        Node curr =head;
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
