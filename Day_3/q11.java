package Day_3;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int  n=Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int  n1=Integer.valueOf(scanner.nextLine());
        int gcd=0;
        for (int i=1 ; i<n || i<n1 ; i++){
            if (n%i==0 && n1%i==0){
                if (gcd<i){
                    gcd=i;
                }
            }
        }
        System.out.println("the gcd of these numbers is "+gcd);
    }
}
