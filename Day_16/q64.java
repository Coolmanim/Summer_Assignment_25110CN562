package Day_16;

import java.util.Scanner;

public class q64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
