package Day_9;

public class q36 {
    public static void main(String[] args){
        printSquare(5);

    }
    public static void printStar(int n){
        for (int i=1 ; i<=n ;i++){
            System.out.print("*");
        }
    }
    public static void printSpace(int n){
        for (int i=1 ; i<=n ;i++){
            System.out.print(" ");
        }
    }
    public static void printSquare(int n){
        for (int i=1 ; i<=n ; i++){
            if(i==1 ||i==n){
                printStar(n);
            }else{
                System.out.print("*");
                printSpace(n-2);
                System.out.print("*");
            }
            System.out.println("");
        }
    } 
}
