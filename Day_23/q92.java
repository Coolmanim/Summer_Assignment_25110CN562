package Day_23;

import java.util.Scanner;

public class q92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        int max = -1;
        char result = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        
        System.out.println("Maximum occurring character: " + result);
        
        scanner.close();
    }
}
