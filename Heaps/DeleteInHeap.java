import java.util.ArrayList;

public class DeleteInHeap 
{
    static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static int remove()
    {
        int data=arr.get(0);
        //step 1:swap first and last 
        int temp =arr.get(0);
        arr.set(0,arr.size()-1);
        arr.set(arr.size()-1,temp);

        //step 2:delete last 
        arr.remove(arr.size()-1);

        //step3 : recover other funtion and call heapify for it
       heapify(0);
       return data;

    }
     private static void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size()  &&  arr.get(minIdx)>arr.get(left))
            {
                minIdx=left; 
            }
             if(right<arr.size()  &&  arr.get(minIdx)>arr.get(right))
            {
                minIdx=right; 
            }
            if(minIdx!=i)
            {
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
        }
       public static void main(String args[])
       {
        int arr[]=new int[]{1,0,4,5,3};
        for(int i=0;i<arr.length;i++)
        {
            heapify(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
        remove();
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
       }
}
