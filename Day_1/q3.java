package Day_1;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int s1=Integer.valueOf(scanner.next());
        int k=1;
        for (int i=1 ; i<=s1 ;i++){
            k=k*i;
        }
        System.out.println("Factorial: "+k);
    }
}
