public class PrintInRange 
{
    static class Node 
    {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Inorder(Node root) 
    {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

   public static Node Insert(Node root,int val)

    {
        if(root==null) 
        {
            return new Node(val);
        }
        if(root.data>val)
        {
            root.left=Insert(root.left,val);
        }
       if(root.data<val)
        {
            root.right=Insert(root.right,val);
        }
        return root;
    }

    public static void PrintInRange(Node root, int k1, int k2) 
    {
        if(root == null)
        {
            return;
        }
        if (root.data >= k1 && root.data <= k2) 
        {
            PrintInRange(root.left, k1, k2);
            System.out.println(root.data);
            PrintInRange(root.right, k1, k2);
        } else if (root.data < k1) 
        {
            PrintInRange(root.left, k1, k2);
        } else 
        {
            PrintInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args)
    {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Inorder(root);
       // PrintInRange(root, 5, 12);
    }
}
