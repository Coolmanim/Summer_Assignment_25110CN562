package Day_3;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number:");
        int  n=Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int  n1=Integer.valueOf(scanner.nextLine());
        int lcm=(n>n1)?n:n1;
        while(true){
            if (lcm%n==0 && lcm%n1==0){
                break;
            }
            lcm++;
        }
        System.out.println("The LCM of the given numbers is "+lcm);
    }
}
