package Bridgelabz_Training.ClassWork;

public class Question9_Account {
  String accountHolder;
  double balance;

  public void data() {
    System.out.println(accountHolder + " " + balance);
  }

  public static void main(String[] args) {
    Question9_Account acc = new Question9_Account();
    acc.data();
  }
}