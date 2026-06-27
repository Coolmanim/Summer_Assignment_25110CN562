package Day_22;

import java.util.Scanner;

public class q88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t') {
                result += ch;
            }
        }
        
        System.out.println("String after removing spaces: " + result);
        
        scanner.close();
    }
}
