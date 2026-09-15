package Array_In_Java;

import java.util.Scanner;

public class Number_Of_Duplicate_Element {
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

        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            }

        }

        System.out.println();
        System.out.println("Number of duplicates : " + count);
    }
}