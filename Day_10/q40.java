package Day_10;

public class q40 {
    
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
            char a='A';
            for (int k=-1 ; k<(height-i) ; k++ ){
                
                System.out.print(a);
                a++;
            }
            a='A';
            for (int j=(height-i-1) ; j>=0 ; j--){
                System.out.print((char)(a+j));
                
            }
           
            System.out.println("");
        }
       

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        christmasTree(10);
    }
}


