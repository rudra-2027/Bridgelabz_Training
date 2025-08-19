package Bridgelabz_Training.ClassWork;

public class Question10 {
  static {
    System.out.println("Inside Static Variable");
  }
  {
    int val = 20;
    System.out.println("Inside Instance");
  }

  public void display() {
    System.out.println("Inside Local Variable");
  }

  public static void main(String[] args) {
    Question10 res = new Question10();
    res.display();
  }
}
