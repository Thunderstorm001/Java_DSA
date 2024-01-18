
public class DiameterOfTree {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    
       // static int idx;

        // public static Node Buildtree(int nodes[]) {
        //     idx++;
        //     if (nodes[idx] == -1) {
        //         return null;
        //     }
        //     Node newNode = new Node(nodes[idx]);
        //     newNode.left = Buildtree(nodes);
        //     newNode.right = Buildtree(nodes);
        //     return newNode;
        // }

        public static int Height(Node root) {
            if (root == null) {
                return 0;
            }
            int rightH = Height(root.right);
            int leftH = Height(root.left);
            return Math.max(rightH , leftH )+ 1;
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
           

            System.out.println((diameter(root)));
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int LeftHeight = Height(root.left);
            int leftdia = diameter(root.left);
            int rightHeight = Height(root.right);
            int rightdia = diameter(root.right);
            int selfDiameter = LeftHeight + rightHeight + 1;

            return (Math.max(selfDiameter, Math.max(leftdia, rightdia)));
    }

    
}
