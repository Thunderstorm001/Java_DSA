import java.util.*;
public class RootToLeafPaths {
    
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

    public static void printRtoL(Node root,ArrayList <Integer>path)
    {
        if(root==null)
        {
            return ;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
           printPath(path);
        } 
        printRtoL(root.left,path);
        printRtoL(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path)
    {
        for(int ifl=0;ifl<path.size();ifl++)
        {
            System.out.print(path.get(ifl)+"->");
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();

        printRtoL(root, new ArrayList<Integer>());
        Inorder(root);
    }
}
