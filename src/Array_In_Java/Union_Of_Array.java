
package Array_In_Java;

import java.util.Scanner;

public class Union_Of_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int s1 = sc.nextInt();
        int[] a = new int[s1];

        System.out.print("Enter the size of second array: ");
        int s2 = sc.nextInt();
        int[] b = new int[s2];

        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("First Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Second Array:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

        System.out.println("Union Array:");

        // Step 1: Print unique elements of first array
        for (int i = 0; i < a.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                System.out.print(a[i] + " ");
            }
        }

        // Step 2: Print unique elements of second array
        // that are not present in the first array
        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            // Check in the first array
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            // Check previous elements of the second array
            for (int k = 0; k < i; k++) {
                if (b[i] == b[k]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
