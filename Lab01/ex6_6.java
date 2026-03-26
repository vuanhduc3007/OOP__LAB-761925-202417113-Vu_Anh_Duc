package Lab01;

import java.util.Scanner;

public class ex6_6 {
    private static void inputMatrix(Scanner sc, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Input element[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }
    }

    private static void displayMatrix(double[][] matrix) {
        System.out.println("Ma tran tong la: ");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang");
        int row = scanner.nextInt();
        System.out.println("Nhap so cot");
        int col = scanner.nextInt();
        
        double[][] matrix1 = new double[row][col];
        double[][] matrix2 = new double[row][col];
        double[][] matrix3 = new double[row][col];
        
        System.out.println("Nhap ma tran 1: ");
        inputMatrix(scanner, matrix1);
        
        System.out.println("Nhap ma tran 2: ");
        inputMatrix(scanner, matrix2);
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        displayMatrix(matrix3);
        System.exit(0);
    }
}
