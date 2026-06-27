package Day_23;

import java.util.Scanner;
import java.util.Arrays;

public class q91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        boolean isAnagram = true;
        
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            isAnagram = Arrays.equals(charArray1, charArray2);
        }
        
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        scanner.close();
    }
}