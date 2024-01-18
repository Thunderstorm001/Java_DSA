//package Recurssion;

public class powfun {
        public static double pow(double x, int n) {
            // Base case: If n is 0, return 1
            if (n == 0) {
                return 1;
            }
    
            // Recursive case for even n
            if (n % 2 == 0) {
                double temp = pow(x, n / 2);
                return temp * temp;
            }
            // Recursive case for odd n
            else {
                double temp = pow(x, (n - 1) / 2);
                return x * temp * temp;
            }
        }
    
        public static void main(String[] args) {
            System.out.println(pow(2, 5));     // Output: 32.0 (2^5)
            System.out.println(pow(3, 4));     // Output: 81.0 (3^4)
            System.out.println(pow(1.5, 3));   // Output: 3.375 (1.5^3)
        }
}
