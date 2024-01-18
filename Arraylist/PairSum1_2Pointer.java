import java.util.ArrayList;

public class PairSum1_2Pointer {
    public static void  main(String args[])
    {
        ArrayList <Integer> list= new ArrayList <> ();
        //1 2 3 4 5 6 
        list.add(1);
        list.add(2); 
        list.add(3);  
        list.add(4); 
        list.add(5); 
        list.add(6); 
        list.add(7); 
        list.add(8); 

      int  target=14;
       System.out.println(PairSum1(list,10));
    }
    public static boolean PairSum1(ArrayList<Integer> list,int target)
    {
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp)
        {
            //case 1
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            //case 2 
            else if(list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            else {
                rp++;
            }
        }
        return false ;
    }
}
