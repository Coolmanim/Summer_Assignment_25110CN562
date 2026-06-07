package Day_7;
import java.util.Scanner;
public class q28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println(reverse(n));
    }
    public static int reverse(int num){
        int s=0;
        while(num>0){
            s=s*10+(num%10);
            num=num/10;
        }
        return s;
    }
}
