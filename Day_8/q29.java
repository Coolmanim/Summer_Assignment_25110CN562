package Day_8;

public class q29 {
    public static void main(String[] args){
        printTriangle(5);

    }
    public static void printTriangle(int size) {
        for ( int i=1 ; i<=size ;i++){
            for (int j=i ; j>=1 ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
