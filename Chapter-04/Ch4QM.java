// Book: Let Us Java
// Chapter 4 – Question M
// Problem : Determine wether a character is a special symbol or not.
import java.util.Scanner;

public class Ch4QM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);

        String result = ((c >= 33 && c <= 47)
         || (c >= 58 && c <= 64)
         ||(c >= 91 && c <= 96)
         ||(c >= 123 && c <= 126))
         ?"Charcter is a special symbol"
         :"Character is not a special symbol";
        System.out.println(result);

        sc.close();
    }
}
