package Day_21;

import java.util.Scanner;

public class q84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string in lowercase: ");
        String str = scanner.nextLine();
        
        String uppercaseStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uppercaseStr += (char) (ch - 32);
            } else {
                uppercaseStr += ch;
            }
        }
        
        System.out.println("Uppercase string: " + uppercaseStr);
        
        scanner.close();
    }
}
