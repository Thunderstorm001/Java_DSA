import java.util.*;

public class hashmapbasics {
        public static void main(String[] args) {
HashMap<String, Integer> map = new HashMap<String, Integer>();
                map.put("a", 1);
                map.put("b", 2);
                map.put("c", 3);
                map.put("d", 4);
                map.put("e", 5);


                // get
                System.out.println(map.get("f"));
                // contiains
                System.out.println(map.containsKey("e"));
                // remove
                System.out.println(map.remove("a"));
                System.out.println(map);
                // size
                System.out.println(map.size());
                // isEmpty()
                System.out.println(map.isEmpty());
                // clear
                map.clear();
                // size
                System.out.println(map.size());
                // isEmpty()
                System.out.println(map.isEmpty());


                // iterate
                 Set<String> keys = map.keySet();
                System.out.println(keys);
                for (String k : keys) {
                        System.out.println("key=" + k + ",value=" + map.get(k));
                }
        }
}