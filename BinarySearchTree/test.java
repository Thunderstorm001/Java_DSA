public  class test
{
   static  class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

static class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static LinkedList makeUnion(LinkedList list1, LinkedList list2) 
    {
        LinkedList unionList = new LinkedList();

        Node curr1 = list1.head;
        Node curr2 = list2.head;

        // Traverse both lists and add distinct elements to the union list
        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                unionList.insert(curr1.data);
                curr1 = curr1.next;
            } else if (curr2.data < curr1.data) {
                unionList.insert(curr2.data);
                curr2 = curr2.next;
            } else {
                unionList.insert(curr1.data);
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
        }

        // Add remaining elements from list1, if any
        while (curr1 != null) {
            unionList.insert(curr1.data);
            curr1 = curr1.next;
        }

        // Add remaining elements from list2, if any
        while (curr2 != null) {
            unionList.insert(curr2.data);
            curr2 = curr2.next;
        }

        return unionList;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);

        LinkedList list2 = new LinkedList();
        list2.insert(3);
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);

        LinkedList unionList = makeUnion(list1, list2);
        unionList.display();  // Output: 1 2 3 4 5 6
    }
}

}