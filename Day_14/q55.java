package Day_14;
import java.util.Scanner;
public class q55 {
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
        int max2=0;
        for(int i=1; i<size ; i++){
            if(array[i]>max){
                max2=max;
                max=array[i];
            }
            
        }
        System.out.println("Second largest : "+max2);
        //System.out.println("smaalest : "+min);
    }
}
