import java.util.ArrayList;

public class MaxiNum {
    public static void main(String args[])
    {
        int max=Integer.MIN_VALUE;
        ArrayList <Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        for(int i=0;i<l.size();i++)
        {
        //    if(l.get(i)>max)
        //    {
        //     max=l.get(i);
        //    }
        max=Math.max(max, l.get(i));

        }
        System.out.println("max value is :"+max);
    }
}
