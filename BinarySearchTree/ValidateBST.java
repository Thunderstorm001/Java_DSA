public class ValidateBST
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
    
    //check if max value in left subtree < node 
    //check if max value in right subtree >node 

    public static boolean isValidBST(Node root,Node min, Node max)
    {
        if(root==null)
        {
            return true;
        }

        if(min!=null && root.data<= min.data)
        {
            return false ;
        }
        else if(max!=null && root.data>= max.data)
        {
            return false ;
        }
        
       return  isValidBST(root.left, min, root)&& isValidBST(root.right, root, max);
    }
    public static void main(String[] args)
    {
        int values[] = { 1,1,1};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Inorder(root);
       // PrintInRange(root, 5, 12);
       if(isValidBST(root, null, null))
       {
        System.out.println("valid BSt");
       }
       else
       {
        System.out.println("not valid BST");
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
}