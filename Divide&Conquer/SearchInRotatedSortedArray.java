import java.lang.annotation.Target;

public class SearchInRotatedSortedArray {
    //given:sorted and rotated at pivote , array  with distinct values find index of given element in array
    //method 1 : linear search 
    //method 2 : modified binary search
    // case 1 : mid on L1 --case a l1 left side as si<= target <= mid
    //                     --case b l1 right as else 
    //case 2 : mid on L2 --case a l2 right side as mid<= target<ei
    //                     --case b l2 left else

    public static void main(String[] args)
    {
        int arr[]={4,5,6,7,1,2,3};
        int target=1;
        int targetidx=search(arr, target, target, target);
        System.out.println(targetidx);
    }

    public static int search(int[] arr, int target, int si, int ei) {
        // base
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // case 1:found
        if (arr[mid] == target)
            return mid;

        if (arr[si] <= arr[mid])// mid on line 1 condition of lying on line
        {
            // case a :left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // case b :right
                return search(arr, target, mid + 1, ei);
            }
        } else // lying on line 2
        {
            // case c :right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d :left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }
}
