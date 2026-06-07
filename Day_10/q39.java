package Day_10;

public class q39 {
    public static void printStars(int number) {
        for (int i=1 ; i<=number ;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int j=number ; j>0 ; j-- ){
            System.out.print(" ");
        }
    }

    public static void christmasTree(int height) {
        for (int i=height ;i>0 ; i--){
            printSpaces(i-1);
            int a=1;
            for (int k=-1 ; k<(height-i) ; k++ ){
                
                System.out.print(a);
                a++;
            }
            
            for (int j=(height-i) ; j>=1 ; j--){
                System.out.print(j);
                
            }
           
            System.out.println("");
        }
        /*for (int i=1 ; i<3 ; i++){
            printSpaces(height-2);
            printStars(3);
        }*/

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        christmasTree(10);
    }
}
