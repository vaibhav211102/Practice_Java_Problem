package Array_In_Java;

import java.util.Scanner;

public class Move_All_Negative_In_Front_Of_Array {
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
            if (a[i] < 0){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                index++;
            }
        }

        System.out.println();
        System.out.println("Array after negative element in front : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
