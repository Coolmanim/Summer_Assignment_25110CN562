package Day_4;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= Integer.valueOf(scanner.nextLine());
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
            System.out.println("The number is Armstrong.");
        }else{
            System.out.println("The number is not Armstrong.");
        }
    }
}
