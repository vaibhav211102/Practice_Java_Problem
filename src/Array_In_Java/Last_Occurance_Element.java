package Array_In_Java;

import java.util.Scanner;

public class Last_Occurance_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println();
        System.out.println("Enter the array element : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == target) {
                System.out.println("Last occurance of element at index" + " " + (i + 1) + ": " + a[i]);
                break;
            }
        }
    }
}
