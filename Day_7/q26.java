package Day_7;
import java.util.Scanner;
public class q26 {
    public static int getFibonacci(int n) {
        
        if (n <= 1) {
            return n;
        }
        // Recursive Case: F(n) = F(n-1) + F(n-2)
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print
        
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        
        // Loop to print each term using the recursive function
        for (int i = 0; i < terms; i++) {
            System.out.print(getFibonacci(i) + " ");
        }
    }
}
