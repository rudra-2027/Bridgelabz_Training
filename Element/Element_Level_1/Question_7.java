package Element_Level_1;
//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class Question_7 {
	public static void main(String[] args) {
		double a = 6378;
        double b = Math.PI;

        double c = (4.0 / 3.0) * b * Math.pow(a, 3);
        double d = a / 1.609;
        double e = (4.0 / 3.0) * b * Math.pow(d, 3);

        System.out.println("The volume of earth in cubic kilometers is " + c +
                           " and cubic miles is " + e);
	}

}
