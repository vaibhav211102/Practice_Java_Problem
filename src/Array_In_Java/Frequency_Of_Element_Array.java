package Array_In_Java;

import java.util.Scanner;

public class Frequency_Of_Element_Array {
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

        System.out.println();
        System.out.println("Enter the element : ");
        int element = sc.nextInt();

        int countFrequency = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == element) {
                countFrequency++;
            }
        }

        System.out.println();
        System.out.println("The frequency of given element : " + countFrequency);
    }
}
