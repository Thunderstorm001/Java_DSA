

public class longestSubarrMaxsumk {
        public static int longestSubarrayWithSumK(int []a, long k) {
            // Write your code here
            //brute force Approach 
        //     int len=0;
        //     int n=a.length;
        //     for(int i=0;i<n;i++){
        //         for(int j=i;j<n;j++){
        //             int sum=0;
        //             for(int l=i;l<=j;l++){
        //                 sum+=a[l];
        //                 if(sum==k){
        //                 len=Math.max(len,j-i+1);
        //                }
        //             }
        //         }
        //     }
        //   return len;  
          
               //optimum-->>O(n) 2 pointer
               int n=a.length;
               int right=0,left=0;
               long sum=a[0];
               int maxlength=0;
               while(right<n)
               {
                while(sum>k)
                {
                       sum=sum-a[left];
                       left++;
                }
                if(sum==k)
                   {
                       maxlength=Math.max(maxlength, right -left +1);
                   }
                right++;
                if(right<n)
                   {
                       sum+=a[right];
                   }
               }
               return maxlength;
            
        
        }
}
