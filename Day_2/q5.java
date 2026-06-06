package Day_2;
import java.util.Scanner;
public class q5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        System.out.println("Give a number:");
        int s=Integer.valueOf(scanner.nextLine());
        while (s>0){
            int r=s%10;
            s=s/10;
           
            c=c+r;
        }
        System.out.println("Sum of digits: "+c);
    }
}
