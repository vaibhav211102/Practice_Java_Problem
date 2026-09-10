package Array_In_Java;

import java.util.Scanner;

public class Larger_Element_In_Row {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row : ");
        int row = sc.nextInt();

        System.out.println("Enter the size of column : ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter the element of matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matrix : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < row; i++) {

            int larger = matrix[i][0];

            for (int j = 1; j < column; j++) {
                if (matrix[i][j] > larger) {
                    larger = matrix[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + " : " + larger);
        }
    }
}
