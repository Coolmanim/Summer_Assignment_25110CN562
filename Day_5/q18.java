package Day_5;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        int v=0;
        for (int i =1 ; i<n ;i++){
            if (n%i==0){
                v=v+i;
            }

        }
        if (v==n){
            System.out.println("the number entered is strong.");
        }else{
            System.out.println("the number entered is not strong.");
        }
    }
}
