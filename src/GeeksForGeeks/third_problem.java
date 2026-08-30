package GeeksForGeeks;
import java.util.*;
public class third_problem {
    static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        System.out.println("Fibonacci number : " + Fibonacci(n));
    }
}
