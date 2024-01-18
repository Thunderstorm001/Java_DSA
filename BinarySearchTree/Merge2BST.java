import java.util.ArrayList;

public class Merge2BST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }

    public static Node CreateBSt(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei)
            return null;
        int mid = (si + ei) / 2;
        Node root = new Node(arr.get(mid));
        root.left = CreateBSt(arr, si, mid - 1);
        root.right = CreateBSt(arr, mid + 1, ei);
        return root;
    }

    public static Node mergeBSt(Node root1, Node root2) {

        // step 1: inorder
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // step 3 :merge
        ArrayList<Integer> finalarr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(i)) {
                finalarr.add(arr1.get(i));
                i++;
            } else {
                finalarr.add(arr2.get(j));
                j++;
            }

            // cases of remaining arrays
            while (i < arr1.size()) {
                finalarr.add(arr1.get(i));
                i++;
            }
            while (j < arr2.size()) {
                finalarr.add(arr2.get(j));
                j++;
            }
            // sorted arrays to balanced BST
        }
        return CreateBSt(finalarr, 0, finalarr.size() - 1);
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root = mergeBSt(root2, root1);
        preorder(root);
    }
}
