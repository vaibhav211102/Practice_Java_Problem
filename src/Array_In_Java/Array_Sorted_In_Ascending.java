package Array_In_Java;

import java.util.Scanner;

public class Array_Sorted_In_Ascending {
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

        boolean asc = true;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i +1]){
                asc = false;
                break;
            }
        }

        System.out.println();

        if (asc) {
            System.out.println("Array is in ascending order.");
        } else {
            System.out.println("Array is not in the ascending order.");
        }
    }
}
