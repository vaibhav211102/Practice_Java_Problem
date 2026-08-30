package GeeksForGeeks;
import java.util.*;
public class seventh_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}
