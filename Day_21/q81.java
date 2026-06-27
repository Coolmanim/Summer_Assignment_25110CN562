package Day_21;

import java.util.Scanner;

public class q81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        
        System.out.println("Length of the string: " + length);
        
        scanner.close();
    }
}
