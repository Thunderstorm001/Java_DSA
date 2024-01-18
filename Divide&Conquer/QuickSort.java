//o(nlogn)--avgrage cases
//method --- pivote and partition  
public class QuickSort {
    /*
     * step 1 :pivote
     * step 2 :partition
     * step 3 :partition recusively left n right with base case
     */
    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) 
        {
            return;
        }
        // pivote as last element
        int pidx = partition(arr, si, ei);
        QuickSort(arr, si, pidx - 1);// left
        QuickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make place smaller than pivote
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // making sure pivite is at its place
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 6, 3, 9, 8, 2, 5,-5 };
        QuickSort(arr, 0, arr.length-1);
        printarr(arr);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

///At worst case Time complexity ----> Pivote is always  the smallest or largest element in the array--->o(n^2)

