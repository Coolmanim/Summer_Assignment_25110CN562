package Day_22;

import java.util.Scanner;

public class q86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();
        
        int count = 0;
        boolean isWord = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        
        System.out.println("Total number of words: " + count);
        
        scanner.close();
    }
}
