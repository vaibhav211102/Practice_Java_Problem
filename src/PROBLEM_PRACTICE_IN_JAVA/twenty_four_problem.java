package PROBLEM_PRACTICE_IN_JAVA;
import java.util.*;
public class twenty_four_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.print("Guess the number between (1 to 100) : ");
        int guess = sc.nextInt();

        while (true) {
            if (randomNumber < guess) {
                System.out.println("Guess Lower!");
                System.out.print("Guess again the number between (1 to 100) : ");
                guess = sc.nextInt();
            } else if (randomNumber > guess) {
                System.out.println("Guess Higher!");
                System.out.print("Guess again the number between (1 to 100) : ");
                guess = sc.nextInt();
            }
            else {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
