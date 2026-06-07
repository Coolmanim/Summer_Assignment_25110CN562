package Day_12;
import java.util.Scanner;
public class q45 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        palindromeCheck(n);
    }
    public static void palindromeCheck(int s){
        int c=0;
        while (s>0){
            int r=s%10;
            s=s/10;
           
            c=c*10+r;
        }
        if (c==s){
            System.out.println("Number is a palindrome.");
        }else{
            System.out.println("Number is not a palindrome.");
        }
    }
}
