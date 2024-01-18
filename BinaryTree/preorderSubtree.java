
public class preorderSubtree {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) 
        {
           
            idx++;
            Node newNode = new Node(nodes[idx]);
            if (nodes[idx] == -1) {
                return null;
            }
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.println("-1");
                return;
            }
            System.out.println(" "+ root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root)
        {
            if(root== null)
            {
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        } 
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node ro0t = tree.BuildTree(nodes);
        // System.out.println(root.data);
        //tree.preorder(ro0t);
        tree.inorder(ro0t);
    }
}
