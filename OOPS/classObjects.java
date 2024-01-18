//objects are real world entities
//class are group of entity ex class car 
//class ->attributes + function
//ex Pen is object 

public class classObjects{
    public static void main(String[] args)
    {
        Pen p1=new Pen();//constructor created pen object
        p1.setColor("HOT red");
        System.out.println(p1.colur);
        p1.setTip(2);
        System.out.println(p1.tip);
    }
}
 class Pen
{
    String colur="black";
    int tip=6;
    void setColor(String newcolur)
    {
         colur = newcolur;
    }
     void setTip(int newtip)
     {
         tip = newtip;
     }
}
