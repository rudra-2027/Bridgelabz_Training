package Bridgelabz_Training.ClassWork;

public class Question13 {
  public static void main(String[] args) {
    System.out.println();
  }
}

class A {
  static int x = 10;
}

class B {
  public static void main(String[] args) {
    System.out.println("Without Changing the value -> " + A.x);
    A.x = 50;
    System.out.println("After Changing the value -> " + A.x);
  }
}
