package Bridgelabz_Training.ClassWork;

public class Car {
  static int cnt;
  String model;
  int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
    cnt++;
  }

  public void details() {
    System.out.println(model + " " + year);
  }

  public static void returnNumberOfObject() {
    System.out.println(cnt);
  }

  public static void main(String[] args) {
    Car car1 = new Car("BMW", 1988);
    Car car2 = new Car("AUDI", 2001);
    car1.details();
    car2.details();
    // System.out.println(cnt);
    Car.returnNumberOfObject();

  }
}