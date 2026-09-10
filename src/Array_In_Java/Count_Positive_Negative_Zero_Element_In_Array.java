package Array_In_Java;
import java.util.*;
public class Count_Positive_Negative_Zero_Element_In_Array {
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

        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                countZero++;
            } else if (a[i] < 0) {
                countNegative++;
            }else {
                countPositive++;
            }
        }

        System.out.println();
        System.out.println("Positive Elements : " + countPositive);
        System.out.println("Negative Elements : " + countNegative);
        System.out.println("Zero Element : " + countZero);
    }
}
