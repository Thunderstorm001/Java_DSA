import java.util.Scanner;

public class StringtoInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = strToInt(str, 0);
        System.out.println(ans);
    }

    public static int strToInt(String str, int number) {
        if (str.length() == 0) {
            return number;
        }
        char ch = str.charAt(0);
        number = number + (ch - 48) * (int) Math.pow(10, str.length() - 1);
        String ros = str.substring(1);
        return strToInt(ros, number);
    }
}

