import java.util.ArrayList;
import java.util.List;

public class Container_MostWater {
    public static void main(String args[]) {
       ArrayList<Integer> h = new ArrayList<>();// arraylist of height
        // 1 8 6 2 5 4 8 3 7
        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7);
        System.out.println(storeWater(h));
    }

    public static int storeWater(ArrayList<Integer> height) {
        int maxwater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxwater = Math.max(maxwater, currWater);
            }
        }
        return maxwater;
    }
}
