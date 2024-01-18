//package Divide&Conquer;
//base case 
//mid =si+ei/2
//left.sort 
//right.sort
//megre ---Time Compxeity O(n log n)
public class MergeSort {
    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8,-2 };
        MergeSort(arr, 0, arr.length - 1);
        PrintArray(arr);
    } 

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        // base case
        if (si >= ei) {
            return;
        }

        MergeSort(arr, si, mid);

        MergeSort(arr, mid + 1, ei);

        Merge(arr, si, mid, ei);
        
    }

    public static void Merge(int arr[], int si, int mid, int ei) 
    {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for right part
        int j = mid + 1; // iterator for left part
        int k = 0;// iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k] = arr[i++];
        }

        while (j <= ei) {
            temp[k] = arr[j++];
        }

        // copy the temporary to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];// copy the temporary to original array
        }
    }
}

