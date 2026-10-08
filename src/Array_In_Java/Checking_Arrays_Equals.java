package Array_In_Java;

import java.util.Scanner;

public class Checking_Arrays_Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter the element of the first array : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element of the second array : ");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Array first : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Array second : ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        boolean equals = true;

        if (a.length != b.length){
            equals = false;
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    equals = false;
                    break;
                }
            }
        }

        System.out.println();

        if (equals == true){
            System.out.println("Arrays are equal.");
        }
        else {
            System.out.println("Arrays are not equal.");
        }
    }
}
