import java.io.*;
import java.util.*;
public class add1ToLL {
    //{ Driver Code Starts
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node addOne(Node head) {
        if(head==null)return null;
        head=reverse(head);
        Node p=head;
        int carry=1;
        while(p!=null){
            int sum=p.data+carry;
            p.data=sum%10;//update node value 
            carry=sum/10;//calculate carry for next node
            if(carry!=1)break;
            //whwree there is single node create a new Node for carry 
            if(p.next == null && carry !=0){
                p.next=new Node(carry);
                break;
            }
            p=p.next;
        }
        
        head=reverse(head);
        return head;
    }
    // public static Node addOne(Node head) 
    // { 
    //     //code here.
    //     head=reverse(head);//rfeverse a linkedlist
    //     //boolean f=true;
    //     Node curr=head;
    //     while(curr!=null)
    //     {
    //         if (curr.next == null && curr.data == 9) {//condition 1 curr data =9 and curr.next=null
    //         curr.data=1;
    //         Node temp=new Node(0);
            
    //         temp.next=head;
    //         head=temp;
    //         curr=curr.next;
    //         }
            
    //         else if(curr.data==9){//another condition curr data =9 
    //             curr.data=0;
    //             curr=curr.next;
    //         }
            
    //         else {
    //             curr.data=curr.data+1;
    //             curr=curr.next;
    //             break;
    //         }
    //     }
    //     head=reverse(head);
    //     return head;
    // }
}
