// Book: Let Us Java
// Chapter 4 – Question F
// Problem: Check whether a triangle is valid based on its sides

import java.util.Scanner;
public class Ch4QF {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the 1st  side of the triangle : ");
        float side1 = sc.nextFloat();

        System.out.println("Enter the 2nd  side of the triangle : ");
        float side2 = sc.nextFloat();

        System.out.println("Enter the 3rd  side of the triangle : ");
        float side3 = sc.nextFloat();

        //using ternary operator
        String result =
                (side1 + side2 > side3 &&
                 side1 + side3 > side2 &&
                 side2 + side3 > side1)
                 ? "Triangle is valid."
                 : "Triangle is not valid.";
        System.out.println(result);

        sc.close();
    }
}
