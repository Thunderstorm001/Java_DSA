public class majorityElement {
    public int majorityElement(int[] v) {
        // int n=nums.length;
        // HashMap<Integer,Integer> hm= new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        //  n = n / 2;
        // for (Map.Entry<Integer, Integer> entry : hm.entrySet()) 
        // {
        //     if (entry.getValue() > n) {
        //         return entry.getKey();
        //     }
        // }
        // return 0;
        //____More Voting Algorithum___Striver 
        int n=v.length;
        int cnt=0;
        int el=0;
        for(int i =0 ;i < n ; i ++){
            if(cnt==0){
                //next section
                cnt=1;
                el=v[i];
            }
            else if(v[i]==el){
                cnt++;
            }
            else {
                cnt--;
            }
        }
        //check final 
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(v[i]==el){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return el;
        }
        return -1;
    }
}
