package Day_7;
import java.util.Scanner;
public class q25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
    public static int factorial(int num){
        if (num>0){
            return (num*factorial(num-1));
        }else{
            return 1;
        }
    }
}