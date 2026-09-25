package Loop_In_Java;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int rem = 0;
        int count = 0;

        while(number != 0){
            rem = number % 10;
            count++;
            number = number / 10;
        }

        System.out.println();
        System.out.println("Number of digits : " + count);
    }
}
