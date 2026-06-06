package Day_6;
import java.util.Scanner;
public class q24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the power:");
        int o=Integer.valueOf(scanner.nextLine());
        for(; o>0 ; o--){
            n=n*n;
        }
        System.out.println("Answer: "+n);
    }
}
