// Book: Let Us Java
// Chapter 2 – Question D
// Problem: Convert temperature from Fahrenheit to Celsius

public class Ch2QD {
    public static void main(String args[]) {

        float tempFahrenheit = 95;
        System.out.println("Temperature of Amritsar in fahrenheit : " + tempFahrenheit);

        float tempCelsius = (tempFahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in degree celsius : " + tempCelsius);

    }
}
