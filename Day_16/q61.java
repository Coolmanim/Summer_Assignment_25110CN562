package Day_16;

import java.util.Scanner;

public class q61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        boolean[] present = new boolean[max + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                present[arr[i]] = true;
            }
        }
        
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= max; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
