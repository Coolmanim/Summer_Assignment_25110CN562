package Day_4;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of terms:");
        int n=Integer.valueOf(scanner.nextLine());
        int a=0;
        int b=1;
        int c=0;
        System.out.println("-------------------");
        for (int i=1 ; i<=n ; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        
    }
}
