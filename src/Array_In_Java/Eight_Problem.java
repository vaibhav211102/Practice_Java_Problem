package Array_In_Java;

import java.util.Scanner;

public class Eight_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the array element : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int largest = 0;
        int secondlargest = 0;

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i+1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    largest = a[i];
//                    secondlargest = a[j];
//                }
//            }
//        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondlargest = largest;
                largest = a[i];
            }
        }

        System.out.println();

        System.out.println("Second Largest Element : " + secondlargest);
    }
}
