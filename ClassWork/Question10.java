package Bridgelabz_Training.ClassWork;

public class Question10 {
  // static {
  // System.out.println("Inside Static Variable");
  // }
  // {
  // int val = 20;
  // System.out.println("Inside Instance");
  // }

  // public void display() {
  // System.out.println("Inside Local Variable");
  // }

  // public static void main(String[] args) {
  // Question10 res = new Question10();
  // res.display();
  // }
  int num1 = 10;
  static int num2 = 20;

  public void display() {
    int num3 = 30;
    System.out.println("Instance Value -> " + num1);
    System.out.println("Static Value -> " + num2);
    System.out.println("Local Value -> " + num3);
  }

  public static void main(String[] args) {
    Question10 res = new Question10();
    res.display();
  }

}
