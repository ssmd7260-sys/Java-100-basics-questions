// Book: Let Us Java
// Chapter 4 – Question J
// Problem: Determine wether the point lies on the x-axis , y-axis or in the quadrant.
import java.util.Scanner;

public class  Ch4QJ{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x cordinate of the point  : ");
        int x = sc.nextInt();
        System.out.print("Enter the y cordinate of the point  : ");
        int y = sc.nextInt();

        if(x == 0 && y==0){
            System.out.println("Point lie on the origin.");
        }else if (x !=0 && y == 0) {
            System.out.println("Point lie on the x-axis.");
        }
        else if (x == 0 && y !=0) {
            System.out.println("Point lie on the y axis.");
            
        }
        else{
            System.out.println("Point lies in the quadrant.");
        }

        sc.close();
    }
}
