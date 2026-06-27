package Day_22;

import java.util.Scanner;

public class q85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        boolean isPalindrome = true;
        int low = 0;
        int high = str.length() - 1;
        
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}