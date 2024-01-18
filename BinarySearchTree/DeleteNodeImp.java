
public class DeleteNodeImp {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    // important question
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = Insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        root = delete(root, 1);
        Inorder(root);
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data);
        Inorder(root.right);
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            return Insert(root.left, val);
        }
        if (root.data < val) {
            return Insert(root.right, val);
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        // search for node to delete
        if (root == null) {
            return root;
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        } 
        if (root.data > val) {
            root.left = delete(root.left, val);
        } 
        else // here process start at root data == val
        {
            // case 1 : leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : Single child
             if (root.right == null) 
            {
                return root.left;
            }  if (root.left == null) 
            {
                return root.right;
            }
            // case 3: both children
            // find Inorder succesor ----->always lie in rightsubtree but at lowest value
            // (left most node)
            Node IS = findInorderSuccesor(root.right);// as inorder succesor aways lie in rightsubtree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);// inorder succespr ko detete bhi kr
        }
        return root;
    }

    public static Node findInorderSuccesor(Node root) {
        // note :inorder successor alays lye in left most Node of right
        // Subtree
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
