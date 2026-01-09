// Book: Let Us Java
// Chapter 4 – Question D
// Problem: Check whether a triangle is valid based on its angles 
import java.util.Scanner;

public class Ch4QE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st angle of the triangle : ");
        float ang1 = sc.nextFloat();

        System.out.println("Enter the 2nd angle of the triangle : ");
        float ang2 = sc.nextFloat();

        System.out.println("Enter the 3rd angle of the triangle : ");
        float ang3 = sc.nextFloat();

        float sum  = ang1 + ang2 + ang3;

        if (sum == 180) {
            System.out.println("It is a valid triangle...");
        } else {
            System.out.println("Not a valid triangle...");
        }
        
        sc.close();
    }
}

