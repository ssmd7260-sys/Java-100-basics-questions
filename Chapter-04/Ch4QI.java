// Book: Let Us Java
// Chapter 4 – Question I
// Problem: Determine wether a point lie inside or out side or on the cirle.
import java.util.Scanner;
public class Ch4QI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x cordinate of center : ");
        int x = sc.nextInt();

        System.out.println("Enter the y cordinate of center: ");
        int y = sc.nextInt();

        System.out.println("Enter the radius: ");
        int r = sc.nextInt();

        System.out.println("Enter the x cordinate of point : ");
        int h = sc.nextInt();
        System.out.println("Enter the y cordinate of point : ");
        int k = sc.nextInt();

        //calculating distance of point from center
        double d = Math.sqrt(Math.pow((x-h), 2)+Math.pow((y-k), 2));

        if (d>r) {
            System.out.println("Point lie outside the circle .");
            
        }else if (d<r) {
            System.out.println("Point lie inside the circle.");
            
        }
        else{
            System.out.println("Point lie on the circle.");
        }

        sc.close();
        
    }
}

