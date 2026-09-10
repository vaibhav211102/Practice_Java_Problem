package Array_In_Java;

import java.util.Scanner;

public class Even_Odd_Element_From_Array {
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

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            }
            else{
                countOdd++;
            }
        }

        System.out.println();

        System.out.println("Even Element : " + countEven);
        System.out.println("Odd Element : " + countOdd);
    }
}
