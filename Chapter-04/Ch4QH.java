// Book: Let Us Java
// Chapter 4 – Question H
// Problem: calculate area and perimeter and determine which is greater.

import java.util.Scanner;

public class Ch4QH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle : ");
        int breadth = sc.nextInt();

        int area  = length * breadth;
        System.out.println("area = "+area);

        int perimeter = 2*(length + breadth);
        System.out.println("perimeter = "+perimeter);

        String result = (perimeter > area)
        ? "Perimeter is greater than area."
        : (area > perimeter)
            ? "Area is greater than perimeter."
            : "Area and perimeter are equal.";

        System.out.println(result);

        sc.close();
    }
}
