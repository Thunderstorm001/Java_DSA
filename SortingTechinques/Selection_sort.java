import java.util.*;
class Selection_sort
{
    public static void main(String[] args) {
        int arr[]={1,126,78,53,8,93};
        selectionSort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " " );
        }
    }
    public static void swap(int i,int j ,int arr[])
    {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int min=i;
            for(int j=i; j<arr.length; j++)
            {
                if(arr[j]<arr[min]) {
                    min=j;
                }
            }
            swap(i,min,arr);
        }
    }
}