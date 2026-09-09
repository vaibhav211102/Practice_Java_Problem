package Array_In_Java;

import java.util.Scanner;

public class Third_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the element of the array : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int diff = 0;
        int maxDiff = a[0] - a[1];

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                diff = a[i] - a[j];

                if (diff < 0) {
                    diff = - diff;
                }

                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        System.out.println();

        System.out.println("Maximun Difference : " + maxDiff);
    }
}
