
public class KthAncestorOfNode {
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

    public static void main(String args[]) {
        /*
         * 1
         * 2 3
         * 4 5 6 7 1
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        int k = 2;
        int node = 4;
        KthAncestor(root, node, k);
    }

    public static int KthAncestor(Node root, int node, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == node)
            return 0;
        int leftdist = KthAncestor(root.left, node, k);
        int rightdist = KthAncestor(root.right, node, k);

        if ((leftdist == -1) && (rightdist == -1)) {
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }
}
