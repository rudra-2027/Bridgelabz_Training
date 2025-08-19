package Bridgelabz_Training.ClassWork;

public class Question2_Cars {

}

class Car {
  static int cnt;
  String model;
  int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
    cnt++;
  }

  public static void returnNumberOfObject() {
    System.out.println(cnt);
  }

  public static void main(String[] args) {
    Car car1 = new Car("BMW", 1988);
    Car car2 = new Car("AUDI", 2001);
    // System.out.println(cnt);
    Car.returnNumberOfObject();

  }
}