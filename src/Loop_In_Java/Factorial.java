package Loop_In_Java;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int factorial = 1;

        while(number >= 1){
           factorial *= number;
           number--;
        }
        System.out.println();
        System.out.println("Factorial : " + factorial);
    }
}
