public class LinkedListScratch {
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size = 0;

    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;  
    }

    public void print() {
        Node temp = head;
        if (head == null) return;
        while (temp != null) {
            System.out.print(temp.data + "->"); 
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void add(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index.");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (idx == size - 1) {
            tail = newNode;
        }
    }
    public static int removeFirst() {
        if(size==0)return Integer.MAX_VALUE;
        if(size==1){
            size=0;
            int r=head.data;
            head=tail=null;
            return r;
        }
        size--;
        int temp=head.data;
        head=head.next;
        return temp;
    }
    public static int removeLast(){
        int i=0;
        Node temp=head;
        if(head==null)return Integer.MAX_VALUE;
        if(size==1){
            int r=head.data;
            head=tail=null;
            return r;
        }
        while(i<size-2)
        {
            i++;
            temp=temp.next;
        }
        int r=temp.next.data;
        //get at size -2;
        temp.next=null;
        tail=temp;
        return r;
    }
    public static int search(int key)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static int helper(Node head,int key){
        if(head==null)return -1;
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)return -1;
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head,key);
    }
    public static void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        //return prev;
    }

    public static void main(String[] args) {
        LinkedListScratch ll = new LinkedListScratch();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.add(1, 3);
        ll.print();
        ll.add(2, 4);
        // ll.print();
        // ll.addLast(6);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        ll.print();
        System.out.print(ll.search(4));
        System.out.println(ll.search(9));
        ll.reverse();
        ll.print();
    }
}
