public class rearrangeArrbySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
     //    ArrayList<Integer> pos= new ArrayList<>();
     //    ArrayList<Integer> neg= new ArrayList<>(); 
     //    for(int i=0;i<n;i++){
     //        if(nums[i]>0){
     //            pos.add(nums[i]);
     //        }
     //        else {
     //           neg.add(nums[i]);
     //        }
     //    }
     //    for(int i=0;i<n;i++){
     //        if(i%2==0){
     //            nums[i]=pos.get(0);
     //            pos.remove(0);
     //        }
     //        else{
     //            nums[i]=neg.get(0);
     //            neg.remove(0);
     //        }
     //    }
     //    return nums;
     //optimal approach 
     //ArrayList <Integer> ans= new ArrayList<>(n);
     int ans[]= new int [n];
     int posIdx=0;
     int negIdx=1;
     for(int i=0;i<n;i++){
         if(nums[i]>0){
             ans[posIdx]=nums[i];
             posIdx+=2;
         }
         else{
             ans[negIdx]=nums[i];
             negIdx+=2;
         }
     }
     return ans;
     }
}
