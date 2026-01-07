// Book: Let Us Java
// Chapter 2 – Question B
// Problem: Convert distance in km to meters, feet, inches and centimeters 

class Ch2QB{
    public static void main(String args[]){

        int distanceKM = 60;

        System.out.println("Distance between chhapra and patna :"+ distanceKM+" KM.");
        System.out.println("Distance in different units are as follows:");
        float distanceMeter = distanceKM * 1000f;
        System.out.println("Distance in Meters : "+distanceMeter+"m");

        float dist_ft = distanceMeter * 3.28084f;

        System.out.println("Distance in feet :"+ dist_ft );

        float dist_inch = dist_ft * 12;
        System.out.println("Distance in inch :"+ dist_inch);

        float dist_cm = distanceMeter * 100;
        System.out.println("Distance in centi meter: "+ dist_cm);
    }
}
