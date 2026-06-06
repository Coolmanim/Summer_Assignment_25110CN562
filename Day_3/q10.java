package Day_3;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start:");
        int  n=Integer.valueOf(scanner.nextLine());
        System.out.println("End:");
        int  n1=Integer.valueOf(scanner.nextLine());
        
        for(int num=n ; num<=n1 ;num++){
            int i=2;
            int c=0;
            while (i<num){
                if (num%i==0){
                    c++;
                    break;
                }
                i++;
            }
            if (c==0){
                System.out.println(num);
            }
        }
    }
}
