class deleteAlloccuranceOfK
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class solution {
        public static Node deleteAlloccuranceOfK(Node node,int key) { 
            Node curr=node;
            Node prev=null;
            while(curr!=null){
                if(curr.data==key){
                    if(prev!=null){
                        prev.next=curr.next;//delete that node 
                    }
                }
                else{
                    prev=curr;
                }
                curr=curr.next;
            }
            return node;
        }
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        int k = 2;

        System.out.println("Original Linked List:");
        printLinkedList(head);

        head = solution.deleteAlloccuranceOfK(head, k);
        System.out.println("Linked List after deleting nodes with value " + k + ":");
        printLinkedList(head);
    }
}