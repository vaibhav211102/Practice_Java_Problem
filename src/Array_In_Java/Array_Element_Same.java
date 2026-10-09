package Array_In_Java;

import java.util.Scanner;

public class Array_Element_Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array : ");
        int s1 = sc.nextInt();

        int[] a = new int[s1];

        System.out.print("Enter the size of second array : ");
        int s2 = sc.nextInt();
        int[] b = new int[s2];

        System.out.println("Enter the elements of first array : ");
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

        boolean same = true;

        if (a.length != b.length){
            same = false;
        }else {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] != b[i]){
                    same = false;
                    break;
                }
            }
        }

        System.out.println();

        if (same == true){
            System.out.println("The element are same.");
        }
        else {
            System.out.println("The element are not same.");
        }
    }
}
