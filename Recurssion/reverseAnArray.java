import java.util.*;

class reverseAnArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(0, 0, 7, 6, 3));
        arr = sort(arr);
        System.out.println(arr);
    }

    static ArrayList sort(ArrayList arr) {
        int n =arr.size();
        if (n == 1) {
            return arr;
        }
        int temp = (int) arr.get(n - 1);
        arr.remove(n - 1);//last element removed 
        arr = sort(arr);
        arr = reqPos(temp, arr);
        return arr;
    }

    static ArrayList reqPos(int temp, ArrayList arr) {
        int n =arr.size();
        if (n == 0) {
            arr.add(temp);
            return arr;
        } else if ((int) arr.get(0) >= temp) {
            arr.add(0, temp);return arr;
        } else if ((int) arr.get(n - 1) <= temp) {
            arr.add(n, temp);return arr;
        }
        /// if all of above cases are fasle
        int vish = (int) arr.get(n - 1);
        arr.remove(n - 1);
        reqPos(temp, arr);
        arr.add(n, vish);
        return arr;
    }

}
