package Day_9;

public class q35 {
    public static void main(String[] args){
        printTriangle(5);

    }
    public static void printTriangle(int size) {
        char a='A';
        for ( int i=1 ; i<=size ;i++){
            
            for (int j=1 ; j<=i ; j++){
                System.out.print(a);
                
            }
            a++;
            System.out.println("");
        }
    }
}
