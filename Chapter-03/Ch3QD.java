// Book: Let Us Java
// Chapter 3 – Question D
// Problem: Calculate number of illiterate men and women

public class Ch3QD {
    public static void main(String[] args) {

        int totalPopulation = 80000;

        int totalMen = totalPopulation * 52 / 100;
        int totalWomen = totalPopulation - totalMen;

        int totalLiterate = totalPopulation * 48 / 100;
        int literateMen = totalPopulation * 35 / 100;
        int literateWomen = totalLiterate - literateMen;

        int illiterateMen = totalMen - literateMen;
        int illiterateWomen = totalWomen - literateWomen;

        System.out.println("Total illiterate men: " + illiterateMen);
        System.out.println("Total illiterate women: " + illiterateWomen);
    }
}
