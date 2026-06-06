package Day_6;
import java.util.Scanner;
public class q22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        int r=0;
        int c=0;
        int s=1;
        while(n>0){
            r=n%10;
            n=n/10;
            c=c+r*s;
            s=s*2;
        }
        System.out.println("In binary: "+c);
    }
}
