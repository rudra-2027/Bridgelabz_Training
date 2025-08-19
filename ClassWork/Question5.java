package Bridgelabz_Training.ClassWork;

// public class Question5 {

//   static int val;

//   static void object1(int ans) {
//     val = ans;

//   }

//   static void object2() {
//     System.out.println(val);
//   }

//   public static void main(String[] args) {
//     Question5.object1(5);
//     Question5.object2();

//     Question5.object1(10);
//     Question5.object2();

//   }
// }
public class Question5 {

  static int val = 20;

  public static void main(String[] args) {
    Question5 var1 = new Question5();
    var1.val = 10;
    Question5 var2 = new Question5();
    System.out.println(var2.val);
  }
}
