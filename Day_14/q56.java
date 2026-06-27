package Day_14;
import java.util.Scanner;
public class q56 {
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
        for(int u : array){
            int freq=0;
            for(int uyi : array){
                if(u==uyi){
                    freq++;
                }
            }
            if(freq>0){
                System.out.println(u+" has "+(freq-1)+"duplicates.");
            }
        }
        
    }
}
