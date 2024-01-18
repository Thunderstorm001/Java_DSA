public class accessModifiers {
    public static void main(String[] args) {
        horse h=new horse();
        System.out.println(h.legs);
        h.setlegs(4);
        System.out.println(h.legs);
    }
}
 class animal{
    animal()
    {
        System.out.println("animal consturctor is called");
    }
    static void walks()
    {
        System.out.println("walks");
    }
}

 class horse extends animal
{
     static int legs;
    horse()
    {
        System.out.println("horse constructor called");
    }
    static void legs(){
        System.out.println(legs);
    }
    static void setlegs(int n){
        legs = n;
    }
}
