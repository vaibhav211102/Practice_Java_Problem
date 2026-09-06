package Array_In_Java;
import java.util.Scanner;
public class First_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        System.out.println();

        int[] array = new int[size];

        System.out.println("Enter the element of the array : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        boolean flag = true;
//        int reverse[] = new int[size];
//
//        System.out.println("Reverse Array : ");
//        for (int j = 0; j < array.length; j++) {
//            reverse[j] = array[array.length-1 - j];
//            System.out.print(reverse[j] + " ");
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != reverse[i]) {
//                flag = false;
//                break;
//            }
//        }
//
//        System.out.println();
//
//        if (flag == true) {
//            System.out.println("Array is Palindrome.");
//        }
//        else {
//            System.out.println("Array is not Palindrome.");
//        }

        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-1]) {
                flag = false;
                break;
            }
        }

        System.out.println();

        if (flag == true) {
            System.out.println("Array is Palindrome.");
        }
        else {
            System.out.println("Array is not Palindrome.");
        }
    }
}
