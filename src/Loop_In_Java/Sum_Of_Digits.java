package Loop_In_Java;
import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int rem = 0;
        int sum = 0;

        while (num != 0){
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println();
        System.out.println("Sum of digits : " + sum);
    }
}
