package Day_11;
import java.util.Scanner;
public class q42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:");
        int n=Integer.valueOf(scanner.nextLine());
        System.out.println("enter the second number:");
        int n1=Integer.valueOf(scanner.nextLine());
        maxOftwo(n,n1);
    }
    public static void maxOftwo(int n,int m){
        if(n>m){
            System.out.println(n+" is greater.");
        }else if(m==n){
            System.out.println("The given numbers are equal.");
        }else{
            System.out.println(m+" is greater.");
        }
    }
}
