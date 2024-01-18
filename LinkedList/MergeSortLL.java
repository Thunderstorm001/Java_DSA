public class MergeSortLL {
    static Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)return head;
        
        Node mid=findMid(head);
        
        Node left=head;
        
        Node right=mid.next;
        
        mid.next=null;//divide into 2 parts 
        
        left=mergeSort(left);
        
        right=mergeSort(right);
        
        return merge(left,right);
    }
    
    static Node merge(Node left ,Node right){
        Node dummy=new Node(-1);
        Node curr=dummy;
        
        while(left!=null && right !=null){
            if(left.data<right.data){
                curr.next=left;
                left=left.next;
                curr=curr.next;
            }
            else {
                curr.next=right;
                right=right.next;
                curr=curr.next;
            }
        }
        if(left!=null){
            curr.next=left;
        }
        if(right!=null){
            curr.next=right;
        }
        return dummy.next;
    }
}
