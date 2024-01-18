

public class lca2 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static Node lca(Node root,int n1,int n2) {
        if(root==null)
        {
            return root;
        }
        if(root.data==n1||root.data==n2)
        {
            return root;
        }

        Node leftlca = lca(root.left,n1,n2);
        Node rightlca =lca(root.right,n1,n2);

        //leftlca= val rightlca=null
        if(rightlca==null)
        {
            return rightlca;
        }
        if(leftlca == null)
        {
            return leftlca;
        }
        return root;
    }

     public static void main(String[] args){
        /*
         * 1
         * 2 3
         * 4 5 6 7 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
       int n1=4 ;
       int n2=5 ;
       System.out.println(lca(root, n1, n2).data);
     //  System.out.println(l(root, n1, n2).data);
    }

}
