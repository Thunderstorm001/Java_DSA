public class SumTree {
    static  class Node 
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
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
        transform(root);
        preorder(root);
    }
    public static int transform(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftchild=transform(root.left);
        int rightchild=transform(root.right);

        int data=root.data;
    int newleft=root.left==null?0:root.left.data;
    int newright=root.right==null?0:root.right.data;
    root.data=root.left.data+leftchild+ root.right.data+rightchild;
        return data;
    }

    public static  void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

}
