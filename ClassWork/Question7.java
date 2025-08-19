package Bridgelabz_Training.ClassWork;

public class Question7 {
  // 7. Create a final variable inside a class. Try changing its value later. What
  // error do you get?
  final int val = 20;

  void changeVal() {
    val = 30;
    /*
     * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
     * The final field Question7.val cannot be assigned
     * 
     * at Bridgelabz_Training.ClassWork.Question7.changeVal(Question7.java:9)
     * at Bridgelabz_Training.ClassWork.Question7.main(Question7.java:14)
     * 
     * Because final means that once value is assign which cannot be changed
     */
  }

  public static void main(String[] args) {
    Question7 q7 = new Question7();
    q7.changeVal();
  }

}
