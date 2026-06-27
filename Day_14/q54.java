package Day_14;
import java.util.Scanner;
public class q54{
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
        System.out.println("Enter element to search:");
        int u=Integer.valueOf(scan.nextLine());
        int freq=0;
        for(int uyi : array){
            if(u==uyi){
                freq++;
            }
        }
        System.out.println("the frequency of "+u+" is "+freq+".");
    }
}