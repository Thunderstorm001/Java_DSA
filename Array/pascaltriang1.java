import java.util.ArrayList;
import java.util.List;

public class pascaltriang1 {
    
        public List<Integer> getRow(int n) {
            List<Integer> l = new ArrayList<>();
            
            for (int i = 0; i <= n; i++) {
                if (i == 0 || i == n) {
                    l.add(1);
                } else {
                    long value = (long) l.get(i - 1) * (n - i + 1) / i;
                    l.add((int) value);
                }
            }
            return l;
        }

public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }
}
