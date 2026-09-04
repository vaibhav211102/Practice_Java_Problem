package Conditional_Statement_In_Java;
import java.util.Scanner;
public class Third_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number;
        }else {
            number = number;
        }
        System.out.print(number);
    }
}
