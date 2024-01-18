import java.util.*;

public class buildtree {
    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildtree(int node[]) {
            idx++;
            if (idx >= node.length || node[idx] == -1)
                return null;
            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }

        public static void levelOrder(Node root) {
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null)
                return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) {
            if (root == null)
                return 0;
            int lc = count(root.left);
            int rc = count(root.right);
            return lc + rc + 1;
        }

        public static int sum(Node root) {
            if (root == null)
                return 0;
            int lsum = sum(root.left);
            int rsum = sum(root.right);
            return lsum + rsum + root.data;
        }

        public static int diameter(Node root) {
            if (root == null)
                return 0;
            int leftdiameter = diameter(root.left);
            int rightdiameter = diameter(root.right);
            int leftheight = height(root.left);
            int rightheight = height(root.right);
            int selfdiameter = leftheight + rightheight + 1;
            return Math.max(selfdiameter, Math.max(leftdiameter, rightdiameter));
        }

        static class info {
            int dia;
            int ht;

            info(int dia, int ht) {
                this.dia = dia;
                this.ht = ht;
            }
        }

        public static info Diameter(Node root) {
            if (root == null)
                return new info(0, 0);
            info leftinfo = Diameter(root.left);
            info rightinfo = Diameter(root.right);
            int height = Math.max(leftinfo.ht, rightinfo.ht) + 1;
            int diamter = Math.max(leftinfo.ht + rightinfo.ht + 1, Math.max(leftinfo.dia, rightinfo.dia));
            return new info(diamter, height);
        }

        public static boolean isIdentical(Node node,Node subroot) {
            if(node ==null && subroot==null ) return true;
            else if(node==null ||subroot==null || node.data!=subroot.data ) return false;
            if(!isIdentical(node.left, subroot))return false;
            if(!isIdentical(node.right, subroot))return false;
            return true;
        }

        public static boolean isSubtree(Node root, Node subroot) {
            if (root == null)
                return false;
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }

    public static void main(String[] args) {
        int node[] = { 1, 3, -1, 9, -1, -1, 9, 9, 9, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(node);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.levelOrder(root);
        System.out.println(tree.height(root));
        System.out.println(tree.count(root));
        System.out.println(tree.sum(root));
        System.out.println(tree.diameter(root));
        System.out.println(tree.Diameter(root).dia);
    }
}