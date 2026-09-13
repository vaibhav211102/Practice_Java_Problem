package Array_In_Java;
import java.util.Scanner;
public class Copy_Array {
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

        int[] b = new int[size];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println();
        System.out.println("Copied Array : ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
