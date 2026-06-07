package Day_8;

public class q32 {
    public static void main(String[] args){
        printTriangle(5);

    }
    public static void printTriangle(int size) {
        for ( int i=1 ; i<=size ;i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
