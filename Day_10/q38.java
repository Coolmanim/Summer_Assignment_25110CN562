package Day_10;

public class q38 {
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        masTree(10);
    }
    public static void masTree(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int k=n ;k>=i ;k--){
                System.out.print("*");
            }
            for(int l=n-1 ;l>=i ;l--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
