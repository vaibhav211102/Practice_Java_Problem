package Loop_In_Java;
import java.util.Scanner;
public class Sum_Of_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }else {
                oddSum += i;
            }
        }

        System.out.println();
        System.out.println("Evem Sum : " + evenSum);
        System.out.println("Odd Sum : " + oddSum);
    }

}
