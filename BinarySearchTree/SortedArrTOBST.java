public class SortedArrTOBST {
    public static  class Node 
    {
         int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node createBst(int si,int ei,int arr[])
    {
        int mid=(si+ei)/2;
        if(si>ei)
        {
            return null;
        }
        Node root=new Node(arr[mid]);
        root.left=createBst(si, mid-1, arr);
        root.right=createBst(mid+1,ei,arr); 
        return root;
    }

    public static void  preorder(Node root)
    {
        if(root==null)return ;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args)
    {
        int arr[]={3,5,6,8,10,11,12};
        Node root= createBst(0,arr.length-1, arr);
        preorder(root);
    }
}
