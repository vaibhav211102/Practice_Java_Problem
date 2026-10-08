package Array_In_Java;

import java.util.Scanner;

public class Check_Descending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the element of the array : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        boolean decs = true;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < a[i+1]){
                decs = false;
                break;
            }
        }

        if (decs == true){
            System.out.println("The given array is in the descending order.");
        }
        else{
            System.out.println("The given array is not in the descending order.");
        }
    }
}
