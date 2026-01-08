// Book: Let Us Java
// Chapter 3 – Question E
// Problem: Calculate minimum number of currency notes (100, 50, 10)
import java.util.Scanner;

public class Ch3QE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter amount: ");
        int amount = sc.nextInt();

        int hundredNotes = amount / 100;
        int remainingAmount = amount % 100;

        int fiftyNotes = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

        int tenNotes = remainingAmount / 10;

        int totalNotes = hundredNotes + fiftyNotes + tenNotes;

        System.out.println("Total minimum notes required: " + totalNotes);

        sc.close();
    }
}

