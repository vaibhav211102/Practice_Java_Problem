package Array_In_Java;

import java.util.Scanner;

public class Find_Missing_Smallest_Positive_Number {
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

        int miss = 0;

        for (int positive = 1; positive <= a.length; positive++) {
            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == positive){
                    found = true;
                    break;
                }
            }
            if (!found){
                miss = positive;
                break;
            }
        }

        System.out.println();
        System.out.println("Smallest Missing Positive Number : " + miss);
    }
}
