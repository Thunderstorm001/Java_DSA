import java.util.ArrayList;

public class BSTtoBalancedBSt {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node createBst(int si, int ei, ArrayList<Integer> inorder) {
        int mid = (si + ei) / 2;
        if (si > ei) {
            return null;
        }
        Node root = new Node(inorder.get(mid));
        root.left = createBst(si, mid - 1, inorder);
        root.right = createBst(mid + 1, ei, inorder);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        {
            if (root == null)
                return;
            getInorder(root.left, inorder);
            inorder.add(root.data);
            // System.out.println(root.data);
            getInorder(root.right, inorder);
        }
    }

    public static void main(String[] args) throws Exception {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = BSTtoBalancedBSt(root);
        preorder(root);
    }

    public static Node BSTtoBalancedBSt(Node root) {
        // inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = createBst(0, inorder.size() - 1, inorder);
        // sorted inorder to BST
        return root;
    }

    public static void main(String[] args) {
        String moves1 = "L_RL__R";
        System.out.println(a.FurthestPointFromOrigin.furthestPoint(moves1));  // Output: 3
    
        String moves2 = "_R__LL_";
        System.out.println(a.FurthestPointFromOrigin.furthestPoint(moves2));  // Output: 5
    
        String moves3 = "_______";
        System.out.println(a.FurthestPointFromOrigin.furthestPoint(moves3));  // Output: 7
    }
}
