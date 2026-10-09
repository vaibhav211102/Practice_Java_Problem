package Array_In_Java;

import java.util.Scanner;

public class Common_Element_Bet_Two_Array {
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

        System.out.println();
        System.out.println("Comman Elements : ");

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    count++;
                    break;
                }
            }
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]){
                    alreadyPrinted = true;
                    break;
                }
            }

            if (count > 0 && !alreadyPrinted){
                System.out.print(a[i] + " ");
            }
        }
    }
}
