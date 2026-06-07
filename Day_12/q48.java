package Day_12;
import java.util.Scanner;
public class q48 {
    public static void main(String[] args){
        perfectCheck();
    }

    public static void perfectCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=Integer.valueOf(scanner.nextLine());
        int s=0 ;
        for (int i=1 ; i<n ; i++){
            if (n%i==0){
                s=s+i;
            }
        }
        if (s==n){
            System.out.println("the number entered is perfect.");
        }else{
            System.out.println("the number entered is not perfect.");
        }
    }
}
    

