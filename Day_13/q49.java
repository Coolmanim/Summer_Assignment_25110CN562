package Day_13;
import java.util.Scanner;
public class q49 {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=Integer.valueOf(scan.nextLine());
        int[] array=new int[size];
        System.out.println("enter the elements of the array:");
        for(int i=0; i<size ; i++){
            int y=Integer.valueOf(scan.nextLine());
            array[i]=y;
        }
        for(int element : array ){
            System.out.println(element);
        }
    }
}
