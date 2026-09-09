package Array_In_Java;

import java.util.Scanner;

public class Fitth_Problem {
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

        int currentStart = 0;
        int startIndex = 0;
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i+1] == a[i] + 1) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = currentStart;
                }

            }else {
                currentLength = 1;
                currentStart = i + 1;
            }
        }
        System.out.println();
        System.out.println("Longest consecutive sequence length : " + maxLength);

        System.out.println("Longest consecutive sequence : ");

        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
