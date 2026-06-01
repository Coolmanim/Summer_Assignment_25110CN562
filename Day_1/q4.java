package Day_1;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        System.out.println("Give a number:");
        int s=Integer.valueOf(scanner.nextLine());
        while (s>0){
            int r=s%10;
            s=s/10;
           
            c=c+1;
        }
        System.out.println("Number of numbers: "+c);
    }
}