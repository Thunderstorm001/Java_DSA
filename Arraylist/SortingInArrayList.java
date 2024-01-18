import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    // use collections ---->class (asending order)
    // collection --->interface

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(40);
        list.add(5);
        System.out.println(list);

        // asending order
        Collections.sort(list);
        System.out.println(list);

        // for decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("n");
        list1.add("o");
        list1.add("c");
        Collections.sort(list1);
        System.out.println(list1);
    }
}
