import java.util.ArrayList;
//********O(N)***** */
public class PairSum2Nsorted {
    public static void main(String args[]) {
        //find Pivit point in list
        // use Modular Arithmatic 
        ArrayList <Integer> list= new ArrayList <> ();
        //11 15 6 8 9 10
        list.add(11);
        list.add(15); 
        list.add(6);  
        list.add(8); 
        list.add(9); 
        list.add(10); 
        //list.add(7); 
       // list.add(8); 
       int target=100;
       System.out.println(pairsum2(list, target));
    }
    public static boolean pairsum2(ArrayList <Integer> list,int target)
    {
        int n=list.size();
        int bp=-1;//breaking point
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                //breking point
                bp=1;
                break;
            }
        }
        int lp=bp+1;//smalllest
        int rp=bp;//larget 
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
                lp=(lp+1)%n;
            }
            //case 3
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false ;
    }
}
