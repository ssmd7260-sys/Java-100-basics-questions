// Book: Let Us Java
// Chapter 2 – Question C
// Problem: Calculate aggregate marks and percentage of 5 subjects

import java.util.Scanner;

public class Ch2QC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subject marks:");

        System.out.print("Maths: ");
        int maths = sc.nextInt();

        System.out.print("Science: ");
        int science = sc.nextInt();

        System.out.print("History: ");
        int history = sc.nextInt();

        System.out.print("Geography: ");
        int geography = sc.nextInt();

        System.out.print("Politics: ");
        int politics = sc.nextInt();

        int totalMarks = maths + science + history + geography + politics;
        System.out.println("Aggregate marks: " + totalMarks);

        float percentage = totalMarks / 5f;
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}
