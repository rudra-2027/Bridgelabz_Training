package Bridgelabz_Training.ClassWork;

public class Question15 {
  int val = 10;

  void value() {
    System.out.println("Value is -> " + val);

  }

  void incremnet(int val) {
    this.val = val;
    val++;
    System.out.println("Value After increment -> " + val);
  }

  public static void main(String[] args) {
    Question15 qu = new Question15();
    qu.value();

    qu.incremnet(123);
    qu.value();
  }
}
