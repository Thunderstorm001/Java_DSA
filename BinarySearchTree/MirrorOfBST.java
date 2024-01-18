public class MirrorOfBST {
    static class Node 
    {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args)  
    {
        Node root= new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        createMirror(root);
        Preorder(root);
    }

    public static void Preorder(Node root) {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static Node createMirror(Node root)
    {
        if(root==null)
        {
            return null;
        }

        Node leftsubtree= createMirror(root.left);
        Node rightsubtre= createMirror(root.right);

        root.left=rightsubtre;
        root.right=leftsubtree;
        return root;
    }
}
