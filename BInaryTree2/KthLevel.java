package BInaryTree2;

public class KthLevel {
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
       int k=2;
        Klevel(root, 0, k);
    }

    public static void Klevel(Node root, int level, int k) {
        if (root == null)
            return;

        if (level == k) {
            System.out.println(root.data);
            return;
        }

        Klevel(root.left, level + 1, k);
        Klevel(root.right, level + 1, k);
    }
}
