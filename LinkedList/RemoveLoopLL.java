import java.util.*;
import java.io.*;
import java.lang.*;
public class RemoveLoopLL {
    //{ Driver Code Starts
// driver code
class Node
{
    int data;
    Node next;
}


class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        //case of no loop 
        if(slow!=fast){
            return;
        }
        //wo wala case jisme head pe hi looping he 
        Node check=fast;
        while(head==fast){
            if(check.next==head){
                check.next=null;
                return;
            }
            check=check.next;
        }
        
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        //fast.next = slow.next he means loop shru hua 
        fast.next=null;
    }
}
}
