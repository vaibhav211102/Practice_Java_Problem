package Array_In_Java;
import java.util.*;
public class Zero_Non_Zero_From_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row : ");
        int row = sc.nextInt();


        System.out.print("Enter the number of column : ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println();
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

        int countZeros = 0;
        int countNonZero = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    countZeros++;
                }
                else {
                    countNonZero++;
                }
            }
        }

        System.out.println("Number of zero element : " + countZeros);
        System.out.println("Number of non zero element : " + countNonZero);
    }
}
