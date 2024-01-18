public class permutation {
    public static void main(String args[])
    {
        String str="abc";
        String ans="";
        permutation(str, ans);
    }
    public static void permutation(String str,String ans)
    {
        if(str.length()==0 ){
            System.out.println(ans);return;
        }
        //recursion 
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);//remove ith char 
            permutation(newStr,ans+c);
        }
    }
}
