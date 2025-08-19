package Bridgelabz_Training.ClassWork;

public class Question17 {
  static final double PI = 3.14;

  public void display() {
    System.out.println(PI);
  }

  void changeVal(double val) {
    this.PI = val;
  }

  public static void main(String[] args) {
    Question17 q17 = new Question17();
    q17.display();
    q17.changeVal(20.5541);
    q17.display();
  }

  /*
   * In this question the final variable having the default value which cannot be
   * changed thats why it
   * will give the error
   * 
   * 
   * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
   * The final field Question17.PI cannot be assigned
   * 
   * at sectionF_BridgeLabz_Training.Question17.changeVal(Question17.java:9)
   * at sectionF_BridgeLabz_Training.Question17.main(Question17.java:14)
   */
}
