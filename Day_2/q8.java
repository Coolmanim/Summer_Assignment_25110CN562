package Day_2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int c=0;
            System.out.println("Give a number:");
            int s=Integer.valueOf(scanner.nextLine());
            int s1=s;
            while (s1>0){
                int r=s%10;
                s1=s1/10;
               
                c=c*10+r;
            }
            if (c==s){
                System.out.println("The number "+s+" is a palindrome.");
            }else{
                System.out.println("The number "+s+" is not a palindrome.");
            }
        }
}
