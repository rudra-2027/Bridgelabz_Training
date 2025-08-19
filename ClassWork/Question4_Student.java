package Bridgelabz_Training.ClassWork;

public class Question4_Student {
  String name;
  float marks;

  public Question4_Student(String name, float marks) {
    this.name = name;
    this.marks = marks;

  }

  public void stdDetails() {
    System.out.println(name + " " + marks);
  }

  public static void main(String[] args) {
    Question4_Student std1 = new Question4_Student("Rudra", 90);
    Question4_Student std2 = new Question4_Student("Utkarsh", 95.5F);
    std1.stdDetails();
    std2.stdDetails();

  }

}
