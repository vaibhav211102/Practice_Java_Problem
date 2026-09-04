package Operator_In_Java;
import java.util.Scanner;
public class Eight_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digits number : ");
        int number = sc.nextInt();
        int rem = 0;
        int rev = 0;

        rem = number % 10;
        rev = (rev * 10) + rem;
        number /= 10;

        rem = number % 10;
        rev = (rev * 10) + rem;
        number /= 10;

        rem = number % 10;
        rev = (rev * 10) + rem;
        number /= 10;

        rem = number % 10;
        rev = (rev * 10) + rem;
        number /= 10;

        System.out.println("Reverse of the number : " + rev);
    }
}
