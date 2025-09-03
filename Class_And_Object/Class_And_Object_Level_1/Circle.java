package Class_And_Object_Level_1;
//Program to Compute Area of a Circle
//Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle
public class Circle {
	float radius;
	Circle(float radius){
		this.radius = radius;
	}
	
	void areaofCircle() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle is: "+area);
	}
	void circumferenceofCircle() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
	public static void main(String[] args) {
        Circle c1 = new Circle(5.0f);
        c1.areaofCircle();
        c1.circumferenceofCircle();
    }
}
