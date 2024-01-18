public class LinkedListImplementation {
     static class Node //user defined data type
    {
        int val;
        Node next; 
        Node (int data)
        {
            this.val=val;
            this.next=next;
        }
    }
   static  class Stack//user defined data structure 
    {
        Node head=null;
        int size=0;
        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size()
        {
            return size;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek()
        {
           if(head==null)
          {
            System.out.println("Stack is empty");
            return -1;
          } 
           return head.val;
        }
        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
