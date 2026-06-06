package Day_5;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        for (int i =1 ; i<=n ;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }

        }
        
    }
}

