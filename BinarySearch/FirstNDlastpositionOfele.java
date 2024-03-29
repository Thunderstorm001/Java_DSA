public class FirstNDlastpositionOfele {
    //brute force O(n)
        // first=-1;
        // int last=-1;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==x){
        //         if(first==-1)first=i;
        //         last=i;
        //     }
        // }
        // return new int[]{first,last};
    // public int[] searchRange(int[] arr, int x) {
    //     int n=arr.length;
    //     int lb=lowerBound(arr,n,x);
    //     if(lb==n || arr[lb]!= x ) return new int[]{-1,-1};
    //     return new int[]{lb,upperBound(arr,n,x)-1};
    // }
    // public static int lowerBound(int []arr, int n, int x) {
    //     int ans=n;
    //     int si=0;
    //     int ei=n-1;

    //     while(si<=ei){
    //         int mid=(si+ei)/2;
    //         if(arr[mid]>=x){
    //             ans=mid;
    //             ei=mid-1;
    //         }
    //         else {
    //             si=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int upperBound(int []arr, int n, int x){
    //     int ans=n;
    //     int si=0,ei=n-1;
    //     while(si<=ei)
    //     {
    //         int mid=(si+ei)/2;
    //        if(arr[mid]>x){
    //            ans=mid;
    //            ei=mid-1;
    //        } 
    //        else {
    //            si=mid+1;
    //        }
    //     }
    //     return ans;
    // }
    //aproach 3 
    public static int getstart(int[] arr, int x,int n){
        int si=0,ei=n-1;
        int start=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==x){
                start=mid;
                ei=mid-1;
            }
            else if(arr[mid]<x){
                si=mid+1;
            }
            else {
                ei=mid-1;
            }
        }
        return start;
    }
    public static int getend(int[] arr, int x,int n){
        int si=0,ei=n-1;
        int end=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==x){
                end=mid;
                si=mid+1;
            }
            else if(arr[mid]<x){
                si=mid+1;
            }
            else {
                ei=mid-1;
            }
        }
        return end;
    }
    public int[] searchRange(int[] arr, int x){
        int n=arr.length;
        return new int[]{getstart(arr,x,n),getend(arr,x,n)};
    }
}
