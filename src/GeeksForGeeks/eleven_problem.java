package GeeksForGeeks;
import java.util.*;
public class eleven_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account balance : ");
        int balance = sc.nextInt();
        System.out.println();

        System.out.print("Your account balance is : " + balance);
        System.out.println();

        System.out.print("Enter the amount which you want to withdraw : ");
        int amount = sc.nextInt();
        System.out.println();

        if (amount > 0 && (amount % 100 == 0) && amount <= balance) {

            System.out.println("The amount that you want to withdraw : " + amount);

            int remaining_balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.print("Your remaining balance is : " + remaining_balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
