package Bridgelabz_Training.ClassWork;

public class Question14 {
  int number;

  void setNumber(int number) {
    this.number = number;
  }

  public void display() {
    System.out.println("Number is -> " + number);
  }

  public static void main(String[] args) {
    Question14 question = new Question14();
    question.setNumber(10);
    question.display();

  }
}
