import java.util.HashSet;
import java.util.Set;

public class longestConscutiveSeq{
     public int longestConsecutive(int[] arr) {
        //aproch 1
        // if(arr.length==0)return 0;
        // int lastSmallest=Integer.MIN_VALUE;
        // int currCnt=0;
        // int longest=1;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]-1==lastSmallest){
        //         currCnt++;
        //         lastSmallest=arr[i];
        //     }
        //     // else if(arr[i]==lastSmallest){

        //     // }
        //     else if(arr[i]!=lastSmallest){
        //         currCnt=1;
        //         lastSmallest=arr[i];
        //     }
        //     longest=Math.max(longest,currCnt);
        // }
        // return longest;
        //optimized
        int n = arr.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}