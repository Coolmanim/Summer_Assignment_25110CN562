package Day_17;

import java.util.Scanner;

public class q66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        int[] union = new int[n1 + n2];
        int count = 0;
        
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr1[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[count++] = arr1[i];
            }
        }
        
        for (int i = 0; i < n2; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[count++] = arr2[i];
            }
        }
        
        System.out.print("Union of arrays: ");
        for (int i = 0; i < count; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
