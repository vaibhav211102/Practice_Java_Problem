package Array_In_Java;

import java.util.Scanner;

public class Second_Largest_Number_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println();
        System.out.println("Enter the element of the array : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int largest = a[0];
        int second_Largest = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest){
                second_Largest = largest;
                largest = a[i];
            } else if(a[i] > second_Largest && a[i] != largest){
                second_Largest = a[i];
            }
        }

        System.out.println();
        System.out.println("Second Largest : " + second_Largest);

    }
}
