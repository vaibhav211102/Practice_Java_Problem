package GeeksForGeeks;
import java.util.*;
public class fifth_problem {
    static int power(int n , int p){
        if (p == 0){
            return 1;
        }

        return n * power(n , p-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println();

        System.out.print("Enter the power : ");
        int p = sc.nextInt();

        int result = power(n , p);

        System.out.println("Result : " + result);
    }
}
