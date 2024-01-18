//package LinkedList;

public class AddInLL {
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
    public static int size;

    public static void addFirst(int data) {
        // step 1:create
        Node newnode = new Node(data);
        size++;
        if (head == null)// base case
        {
             head = tail=newnode ;
            return;
        }
        // step 2:
        newnode.next = head;
        head = newnode;
    }
    public static void Add(int idx,int j)
    {
        Node newnode= new Node(j);
        if(idx==0)
        {
            addFirst(j);
            return;
        }
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        //now ptr is at idx -1
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void print()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

       AddInLL ll= new AddInLL();
       ll.addFirst(1);
      ll.Add(1,1);
      ll.Add(2, 2);
      ll.Add(3, 3);
      print();
      System.out.println("______SIZE: "+size+" ______");
    }
}
