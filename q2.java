package Day_1;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the number to print the table of:");
        int first = Integer.valueOf(scanner.nextLine());
        int i=1;
        while(i<11){
            System.out.println(first+" X "+i+" = "+(first*i));        
        }
    }
    
}
