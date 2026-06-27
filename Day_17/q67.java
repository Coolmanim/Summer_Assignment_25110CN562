package Day_17;

import java.util.Scanner;

public class q67 {
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
        
        System.out.print("Intersection of arrays: ");
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
