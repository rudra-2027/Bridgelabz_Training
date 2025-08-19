package Bridgelabz_Training.ClassWork;

public class Question12_User {
  final int userId;

  public Question12_User(int id) {
    this.userId = id;
  }

  public void display() {
    System.out.println("UserId -> " + userId);
  }

  public static void main(String[] args) {
    Question12_User res = new Question12_User(12);
    Question12_User res1 = new Question12_User(101);
    res.display();
    res1.display();

  }
}
