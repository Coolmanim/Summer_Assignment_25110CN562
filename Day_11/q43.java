package Day_11;
import java.util.Scanner;
public class q43 {
    public static void checkPrime(){
        Scanner scanner = new Scanner(System.in);
        int  num=Integer.valueOf(scanner.nextLine());
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
            System.out.println("The number "+num+" is  a prime number.");
        }else{
            System.out.println("The number "+num+" is not a prime number.");
        }
    } 
    public static void main(String[] args){
        checkPrime();
    }
}
