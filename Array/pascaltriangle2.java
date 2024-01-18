import java.util.ArrayList;
import java.util.List;

public class pascaltriangle2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new  ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(getRow(i));
        }
        return ans;
    }
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
}
