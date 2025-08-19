package Bridgelabz_Training.ClassWork;

public class Question19 {
  int n;

  public Question19(int n) {
    this.n = n;
  }

  void display() {
    System.out.println(n);
  }

  public static void main(String[] args) {
    Question19 q19 = new Question19(10);
    q19.display();
    Question19 q19_1 = new Question19(12);
    q19_1.display();

    q19.n = 20;
    q19.display();
    // this shows the Data store in its object
    q19_1.display();
  }
}
