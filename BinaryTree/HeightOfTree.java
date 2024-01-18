public class HeightOfTree {
    //go to child nodes and find height and Use Recurssion 
    static class Node 
    {
        int data;
        Node right;
        Node left;
        Node (int data)
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
        System.out.println(height(root));
    }
    public static int height(Node root)
    {
        //base case
        if(root==null) return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        return Math.max(lefth,righth)+1;
    }
}
