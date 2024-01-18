import java.util.*;
class arrayListBasic
{
    public static void main(String args[])
    {
        List <Integer> list=new ArrayList<>();
        //operations 
        //add -o(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(142);
        System.out.println(list);

        //gettting element at index -o(1)
         System.out.println(list.get(2));

         //delete element from list from idx-o(n)
         list.remove(2);
         System.out.println(list);

         //set element at index (index ,elemet to set)-o()
         list.set(2,6363);
         System.out.println(list);

         //contains element --boolean value 
         System.out.println(list.contains(3));

         //add at particular index (index ,value to add)
         list.add(2,525762);//o(n)
         System.out.println(list); 


         //******size of arraylist *****//
         System.out.println(list.size());

         //print Arraylist
         for(int i=0;i<list.size();i++)
         {
            System.out.print(list.get(i)+" ");
         }
    }
}


