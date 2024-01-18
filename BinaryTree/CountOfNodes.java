public class CountOfNodes {
    static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static void main(String args [])
    {
        /*
         * 1 
         * 2 3 
         * 4 5 6 7      1
         */ 
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
      System.out.println(count(root));
    }
    public static int count(Node root) {
        if (root==null)
        {
             return 0;
        }
       int lcount=count(root.left);
        int rcount=count(root.right);
        return lcount + rcount+ 1;
}
}
