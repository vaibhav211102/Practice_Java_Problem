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

        for (int i = 0; i < a.length; i++) {

            boolean alreadyCounted = false;


            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }


            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Number of duplicate elements : " + count);
    }
}