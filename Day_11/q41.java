package Day_11;
import java.util.Scanner;
public class q41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println("enter the second number:");
        int n1=Integer.valueOf(scanner.nextLine());
        sumOftwo(n,n1);
    }
    public static void sumOftwo(int n,int m){
        System.out.println("The sum is "+(n+m));
    }
}