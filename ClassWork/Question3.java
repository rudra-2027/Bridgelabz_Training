package Bridgelabz_Training.ClassWork;

//3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?
public class Question3 {
  public void method() {
    int val = 10;

  }

  public static void main(String[] args) {
    System.out.println(val);
    /*
     * Unresolved compilation problem:
     * val cannot be resolved to a variable
     * this mean val cannot directly call by the compiler as it is local variable
     * which means when the method is called then the value of val will appears but
     * when it ends val destoryed that's why it cannot access outside the method
     * for this if we want the value we need to make a val as global
     * variable
     */
  }

}
