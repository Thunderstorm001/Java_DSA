public class longetssubarrsum0 {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // int n=arr.length;
        // int max=0;
        // int prefixsum=0;
        // for(int i=0;i<n;i++){
        //     prefixsum=0;
        //     for(int j=i;j<n;j++){
        //     prefixsum+=arr[j];
        //     if(prefixsum==0){
        //         max=Math.max(max,j-i+1);
        //     }
        //   }
        // }
        // return max;
        int n=arr.length;
        int maxi=0;
        int prefixsum=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        //hm.put(1,0);
        for(int i=0;i<n;i++){
             prefixsum+=arr[i];
             if(prefixsum==0){
                 maxi=i+1;
             }
             else {
                if(hm.get(prefixsum)!=null){
                    maxi=Math.max(maxi,i-hm.get(prefixsum));
                }
                else {
                    hm.put(prefixsum,i);
                }
             }
        }
        return maxi;
    }
}
