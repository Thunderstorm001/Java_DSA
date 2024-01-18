import java.util.ArrayList;

public class MinDistBtnNodes {
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
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println(minDist(root, n1, n2));
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundright = getPath(root.left, n, path);
        boolean foundleft = getPath(root.right, n, path);

        if (foundleft || foundright)
            return true;

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // last common ancestor
        int i = 0;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node is -->i-1 th
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }

    }
}
