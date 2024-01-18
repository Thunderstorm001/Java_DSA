public class sum2 {
    public void sortColors(int[] nums) {
        int n=nums.length;
    //    Arrays.sort(nums);
    //better approach 
    // int cnt0=0,cnt1=0,cnt2=0;
    // int n=nums.length;
    //    for(int i=0;i<n;i++){
    //        if(nums[i]==0)cnt0++;
    //        else if(nums[i]==1)cnt1++;
    //        else{
    //            cnt2++;
    //        }
    //    }
    //    for(int i=0;i<cnt0;i++){
    //        nums[i]=0;
    //    }
    //    for(int i=cnt0;i<cnt0+cnt1;i++){
    //        nums[i]=1;
    //    }
    //    for(int i=cnt1+cnt0;i<n;i++){
    //        nums[i]=2;
    //    }

    //______TOUCH NATIONAL FLAG ALOGORITHUM ___
      int low=0,mid=0,high=n-1;
      while(mid<=high){
          if(nums[mid]==0){
              swap(nums,mid,low);
              low++;
              mid++;
          }
          else if(nums[mid]==1){
            mid++;
          }
          else {
              swap(nums,mid,high);
              high--;
          }
      }
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
