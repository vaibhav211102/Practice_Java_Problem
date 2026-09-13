package Array_In_Java;

import java.util.Scanner;

public class Move_Zeros_In_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the elements of the array : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        for (int i = index; i < a.length; i++) {
            a[i] = 0;
        }

        System.out.println();
        System.out.println("After shifting all in the end : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
