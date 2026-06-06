package Day_5;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        int g=1;
        for (int i =1 ; i<=n ;i++){
            if (n%i==0){
                if(isPrime(i)){
                    if (g<i){
                        g=i;
                    }
                }
            }

        }
        System.out.println("Largest prime factor: "+g);
    }
    public static boolean isPrime(int num){
        int i=2;
        int c=0;
        while (i<=(num/2)){
            if (num%i==0){
                c++;
                break;
            }
            i++;
        }
        if (c==0){
            return true;
        }else{
            return false;
        }
    }
}
