package Array_In_Java;
import java.util.Scanner;
public class Second_Problem {
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

        int currentSum  = 0;
        int maxSum = a[0];

        for (int i = 0; i < a.length; i++) {
            currentSum = currentSum + a[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println();

        System.out.println("Maximun Subarray sum : " + maxSum);

//        int[] b = new int[size - 1];

//        int maxSum = 0;
//
//        for (int i = 0; i < a.length - 1; i++) {
//            if (a[i] > a[i+1]) {
//                maxSum += a[i];
//            }
//            else{
//                maxSum += a[i+1];
//            }
//        }

//        System.out.println();
//
//        System.out.println("Array with greater element : ");
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//
//        int maxSum = 0;
//
//        for (int i = 0; i < b.length; i++) {
//            maxSum += b[i];
//        }
//
//        System.out.println();
//
//        System.out.println(maxSum);
    }
}
