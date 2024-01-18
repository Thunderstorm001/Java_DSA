public class mergeSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "  ");
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 5 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        int mid = (si + (ei - si) / 2);
        if (si >= ei)
            return;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left
        int j = mid + 1;// itertaor for right
        int k = 0;// iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // bache huye elements
        // left
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        // right
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
    for (int q = 0; q < temp.length; q++) {
        arr[si + q] = temp[q];
    }
    }
}
