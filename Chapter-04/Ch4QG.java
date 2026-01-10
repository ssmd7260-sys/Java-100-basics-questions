// Book: Let Us Java
// Chapter 4 – Question G
// Problem: Check whether a triangle is equilateral,isosceles or scalane based on its sides
import java.util.Scanner;

public class Ch4QG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side of triagle.");
        float side1 = sc.nextFloat();

        System.out.println("Enter second side of triagle.");
        float side2 = sc.nextFloat();

        System.out.println("Enter 3rd side of triagle.");
        float side3 = sc.nextFloat();

        if(side1 == side2 && side1 == side3 ){
            System.out.println("Triangle is equilateral.");
        }else if (side1 == side2 || side2==side3 || side1 == side3) {
            System.out.println("Triangle is isosceles.");
            
        }else {
            System.out.println("Triangle is scalane.");
            
        }
    }
}
