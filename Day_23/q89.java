package Day_23;

import java.util.Scanner;

public class q89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        char result = ' ';
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        scanner.close();
    }
}
