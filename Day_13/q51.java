package Day_13;
import java.util.Scanner;
public class q51 {
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
        int max=array[0];
        int min=array[0];
        for(int i=1; i<size ; i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("largest : "+max);
        System.out.println("smaalest : "+min);
    }
}
