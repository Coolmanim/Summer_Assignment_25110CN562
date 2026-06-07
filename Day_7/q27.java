package Day_7;
import java.util.Scanner;
public class q27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println(sumOfdigits(n));
    }
    public static int sumOfdigits(int num){
        int s=0;
        while(num>0){
            s=s+(num%10);
            num=num/10;
        }
        return s;
    }
}
