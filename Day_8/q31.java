package Day_8;

public class q31 {
    public static void main(String[] args){
        printTriangle(5);

    }
    public static void printTriangle(int size) {
        
        for ( int i=1 ; i<=size ;i++){
            char a='A';
            for (int j=1 ; j<=i ; j++){
                System.out.print(a);
                a++;
            }
            System.out.println("");
        }
    }
}