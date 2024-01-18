public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2,193};
        InsertionSort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void InsertionSort(int arr[])
    {
        for(int i=1; i<arr.length ; i++)
        {
            int curr=i;
            while(curr>0 && arr[curr-1]>arr[curr])
            {
                swap(curr-1,curr,arr);
                curr--;
            }
        }
    }
    public static void swap(int i,int j ,int arr[])
    {
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }
}
//recursive insertion sort 
/*static void insertion_sort(int[] arr, int i, int n) {
        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);
 */
