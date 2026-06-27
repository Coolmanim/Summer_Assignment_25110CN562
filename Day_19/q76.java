package Day_19;

import java.util.Scanner;

public class q76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int primarySum = 0;
        int secondarySum = 0;
        
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }
        
        System.out.println("Sum of primary diagonal: " + primarySum);
        System.out.println("Sum of secondary diagonal: " + secondarySum);
        
        scanner.close();
    }
}
