package Array_In_Java;

import java.util.Scanner;

public class Reverse_Array_In_Place {
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
        System.out.println("Reverse array in place : ");
        int left = 0;
        int right = a.length - 1;

//        for (int i = 0; i < a.length; i++) {
//            for (int j = a.length; j > 0; j--) {
//                if(left < right){
//                    int temp = a[left];
//                    a[left] = a[right];
//                    a[right] = temp;
//                    right--;
//                    left++;
//                }
//            }
//        }

        while (left < right) {

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
