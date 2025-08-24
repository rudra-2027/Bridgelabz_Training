package Bridgelabz_Training.Assignment-2. String_Level_1;

public class Question_4 {

  public static void generateException() {
    String text = null;

    System.out.println("Length of text: " + text.length());
  }

  public static void handleException() {
    String text = null;
    try {
      System.out.println("Length of text: " + text.length());
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    handleException();
  }
}
