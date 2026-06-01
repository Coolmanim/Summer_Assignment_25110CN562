package Day_1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int s=Integer.valueOf(scanner.nextLine());
        int sum=0;
        for (int i=0; i<=s ;i++){
            sum=sum+i;
        }
        System.out.println("the sum of integers till "+s+" is "+sum);
    }
}
