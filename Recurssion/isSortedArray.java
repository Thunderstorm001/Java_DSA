import java.util.*;
public class isSortedArray 
{
    //Recursively traverse over the array. If it any point we reach an index where arr[i] > arr[i + 1] , we return false. If not , we simply return the result we obtain from further recursive call. Base case would be if we reach the end of the array while traversing , where we return true.

        static boolean isSorted(int[] arr, int i) {
            if (i == arr.length - 1) {
                return true;
            }
            if (arr[i] > arr[i + 1]) {
                return false;
            }
    
            return isSorted(arr, i + 1);
        }
    
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            boolean ans = isSorted(arr, 0);
            System.out.println(ans);
        }
}
