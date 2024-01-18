public class basics {
    static class Node 
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
    static class BinaryTree
    {
        static int idx=-1;
        public static Node Buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=Buildtree(nodes);
            newNode.right=Buildtree(nodes);
            return newNode;
        }
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.Buildtree(nodes);
       // System.out.println(root.data);
        tree.preorder(root);
    }
} 


