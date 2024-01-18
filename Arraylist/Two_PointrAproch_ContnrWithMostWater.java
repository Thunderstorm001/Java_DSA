import java.util.ArrayList;
//_____O(N)_____
public class Two_PointrAproch_ContnrWithMostWater {
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
        System.out.println(StoreWater(h));
    }

    public static int StoreWater(ArrayList<Integer> height) {
        // two pointer approach
        // note :chptte wale line se area depend krta he

        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
}
