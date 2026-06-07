package Day_9;

public class q34 {
    public static void main(String[] args){
        printTriangle(5);

    }
    public static void printTriangle(int size) {
        for ( int i=size ; i>=1 ;i--){
            int k=1;
            for (int j=i ; j>=1 ; j--){
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }
}
