public class BtToMAXBSTSize {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws Exception {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.right = new Node(20);
        root.left.left = new Node(5);
        root.right.right = new Node(70);
        root.right.left = new Node(45);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);
        info a=largestBST(root);
        System.out.println("largest bst size: " + maxBSt);
    }
 
    static class info {
        boolean isBst;
        int size;
        int min;
        int max;

        public info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBSt = 0;

    public static info largestBST(Node root)
    {
        if(root ==null)
        {
            return new info(true, 0,  Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info leftinfo=largestBST(root.left);
        info rightinfo=largestBST(root.right);
        int size=  leftinfo.size+ rightinfo.size+ 1;
        int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
        int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));

        //isbst
        if(root.data <= leftinfo.max || root.data>= rightinfo.min)//invalid condition
        {
              return new info(false, size, min, max);
        }

         if(leftinfo.isBst && rightinfo.isBst)
         {
             maxBSt=Math.max(maxBSt,size);
             return new info(true, size, min, max); 
         }

           return new info(false, size,min,max);
    }
}
