
// Book: Let Us Java
// Chapter 4 – Question L
// Problem : Determine wether a character is in lower case or in upper case.
import java.util.Scanner;

public class Ch4QL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("Character is in lower case");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Character is in upper case");
        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}