package Day_13;
import java.util.Scanner;
public class q52 {
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
        int max=0;
        int min=0;
        for(int i=1; i<size ; i++){
            if(array[i]%2==0){
                max++;
            }else{
                min++;
            }
        }
        System.out.println("even elements : "+max);
        System.out.println("odd elements : "+min);
    }
}
