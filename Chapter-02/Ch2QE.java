// Book: Let Us Java
// Chapter 2 – Question E
// Problem: Calculate area of rectangle and area & circumference of a circle

public class Ch2QE {
    public static void main(String[] args) {

        int length = 40;
        int breadth = 30;

        System.out.println("Length of rectangle: " + length);
        System.out.println("Breadth of rectangle: " + breadth);

        int rectangleArea = length * breadth;
        System.out.println("Area of rectangle: " + rectangleArea);

        int radius = 21;
        System.out.println("Radius of circle: " + radius);

        float circumference = 2 * 3.14f * radius;
        System.out.println("Circumference of circle: " + circumference);

        float circleArea = 3.14f * radius * radius;
        System.out.println("Area of circle: " + circleArea);
    }
}
