import java.util.ArrayList;

public class Swap2Numbers {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        int idx1=1;
        int idx2=3;
        System.out.println(l);
        
        swap(l,idx1,idx2); 
        System.out.println(l);
    }
}
