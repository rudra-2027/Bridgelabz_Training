package Bridgelabz_Training.ClassWork;

public class Car {

  String model;
  int year;

  // public Car(String model, int year) {
  // this.model = model;
  // this.year = year;
  // cnt++;
  // }

  public void details() {
    System.out.println(this.model + " " + this.year);
  }

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();
    car1.model = "BMW";
    car1.year = 1988;
    car2.model = "Audi";
    car2.year = 2001;

    car1.details();
    car2.details();

  }
}