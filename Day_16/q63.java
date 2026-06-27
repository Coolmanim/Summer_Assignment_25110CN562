package Day_16;

import java.util.Scanner;

public class q63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.println("No pair found.");
        }
        
        scanner.close();
    }
}