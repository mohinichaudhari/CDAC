// 40.	Create a class Student having data members name, roll no., age and score.
// Write a program to accept 10 records of student and store them in an array. And then
// arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].

import java.util.Scanner;

class Student {
  private String name;
  private int rollno;
  private int age;
  private int score;

  Student(String name, int rollno, int age, int score) {
    this.name = name;
    this.rollno = rollno;
    this.age = age;
    this.score = score;
  }

  int getScore() {
    return score;
  }

  String getName() {
    return name;
  }
}

class StudentDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s[] = new Student[10];
    String name;
    int rollno, age, score;
    for (int i = 0; i < s.length; i++) {
      System.out.print("Enter the name : ");
      name = sc.next();
      System.out.print("Enter the rollno : ");
      rollno = sc.nextInt();
      System.out.print("Enter the age : ");
      age = sc.nextInt();
      System.out.print("Enter the score : ");
      score = sc.nextInt();
      s[i] = new Student(name, rollno, age, score);
    }

    System.out.print("Students between 0-50 score are : ");
    for (Student a : s) {
      if (a.getScore() >= 0 && a.getScore() <= 50) {
        System.out.print(" " + a.getName());
      }
    }
    System.out.println();
    System.out.print("Students between 50-65 score are : ");
    for (Student a : s) {
      if (a.getScore() > 50 && a.getScore() <= 65) {
        System.out.print(" " + a.getName());
      }
    }
    System.out.println();
    System.out.print("Students between 65-80 score are : ");
    for (Student a : s) {
      if (a.getScore() > 65 && a.getScore() <= 80) {
        System.out.print(" " + a.getName());
      }
    }
    System.out.println();
    System.out.print("Students between 80-100 score are : ");
    for (Student a : s) {
      if (a.getScore() > 80 && a.getScore() <= 100) {
        System.out.print(" " + a.getName());
      }
    }
  }
}
