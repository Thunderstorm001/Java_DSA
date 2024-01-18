public class DoubleLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static Node head;
    static Node tail;
    static int size;
    public static void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        head.prev=null;
    }
    public static void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else 
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        
    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    static int removeFirst(){
        if(head==null)return -1;
        int val=head.data;
        head=head.next;
        head.prev=null;
        return  val;
    }
    public static void main(String[] args) {
        DoubleLL ll=new DoubleLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
         ll.addFirst(40);
        ll.addLast(50);
        ll.removeFirst();
        print();
    }
}
