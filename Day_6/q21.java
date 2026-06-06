package Day_6;
import java.util.Scanner;
public class q21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        int r=0;
        int c=0;
        while(n>0){
            r=n%2;
            n=n/2;
            c=c*10+r;
        }
        System.out.println("In binary: "+c);
    }
}
