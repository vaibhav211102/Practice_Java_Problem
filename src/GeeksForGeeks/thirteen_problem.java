package GeeksForGeeks;
import java.util.*;
public class thirteen_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle : ");
        int a = sc.nextInt();

        System.out.print("Enter the second side of the triangle : ");
        int b = sc.nextInt();

        System.out.print("Enter the third side of the triangle : ");
        int c = sc.nextInt();

        System.out.println();

        System.out.println("The side of the triangles are : " + a + ", " + b + ", " + c);

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("The given triangle is a valid triangle.");

            if (a == b && b == c) {
                System.out.println("The given triangle is Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The given triangle is Isosceles triangle.");
            }
            else {
                System.out.println("The given triangle is Scalene triangle.");
            }
        }
        else {
            System.out.println("The given triangle is not valid triangle.");
        }

    }
}
