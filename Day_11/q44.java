package Day_11;
import java.util.Scanner;
public class q44 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        fibonacci(n);
    }
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        int c=0;
        for (int i=1 ; i<=num ;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
