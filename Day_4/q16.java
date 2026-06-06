package Day_4;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n2= Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second number:");
        int n3= Integer.valueOf(scanner.nextLine());
        
        for (int n=n2 ; n<=n3 ; n++){
            double c=0;
            double s=0;
            for(int n1=n ;n1>0; n1=n1/10){
                c++;
            }
            int n1=n;
            while (n1>0){
                double r=(n1%10);
                n1=n1/10;
                s=s+Math.pow(r,c);
            }
            if (s==n){
                System.out.println(s);
            }else{
                continue;
            }
        }
    }
}
