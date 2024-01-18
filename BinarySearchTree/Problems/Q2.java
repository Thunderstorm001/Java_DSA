
/*  Approach
Get the Middle of the array and make it root.
Recursively do same for left half and right half.
a) Get the middle of left half and make it left child of the root created in step 1.
b) Get the middle of right half and make it right child of the root created in step 1. */
public class Q2 {
    static class Node 
    {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    static Node root;

    static Node Bst(int arr[],int si,int ei)
    {
        //base case
        if(si>ei) return null;

        int mid=(si+(ei-si)/2);
        Node node =new Node(arr[mid]);//taken a middle element and made it root
        node.left=Bst(arr, si, mid-1);
        node.right=Bst(arr, mid+1,ei);
        return node;
    }

    static void Preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args)
    {
        Q2 tree= new Q2();
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        root=Bst(arr, 0, n-1);
        Preorder(root);
    }


    //  public static Node construct(int value [], int l,int h)
    //     {
    //         if(l>h)
    //         {
    //             return null;
    //         }
    //         int mid=(l+h)/2;
    //         Node newNode = new Node(mid);
    //         newNode.data=value[mid];

    //         newNode.left=construct(value,l,mid-1);
    //         newNode.right=construct(value,mid+1,h);
    //         return newNode;
    //     }

    //     public static Node Insert(Node root,int val)

    // {
    //     if(root==null) 
    //     {
    //         return new Node(val);
    //     }
    //     if(root.data>val)
    //     {
    //         root.left=Insert(root.left,val);
    //     }
    //    if(root.data<val)
    //     {
    //         root.right=Insert(root.right,val);
    //     }
    //     return root;
    // }

    //       public void display(Node root) {

    //     if(root == null) return;

    //     System.out.print(root.data+" ");
    //     display(root.left);
    //     display(root.right);
    //       }
}
