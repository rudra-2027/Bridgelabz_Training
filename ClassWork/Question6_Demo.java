package Bridgelabz_Training.ClassWork;

public class Question6_Demo {
  static int val = 20;

  public void changer() {
    int val = 30;
    System.out.println("Using this: -> " + this.val);
    System.out.println("Without this -> " + val);
  }

  public static void main(String[] args) {
    Question6_Demo qD1 = new Question6_Demo();
    qD1.changer();
  }
}
