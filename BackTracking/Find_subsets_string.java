public class Find_subsets_string {
    public static void FindSubset(String str,String ans,int i)
    {
        //base case
        if(i==str.length())
        {
            System.out.print(ans);
            return;
        }
        //recursion 
        FindSubset(str, ans+str.charAt(i), i+1);//yes choice
        FindSubset(str, ans, i+1);//no choice 
    }
    public static void main(String args[])
    {
        String str="abc";
        FindSubset(str, " ", 0);
    }
}

