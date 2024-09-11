class Student {
  String Name;
  int Rollno;
  int Marks;

  Student(String name, int rollno, int marks) {
    this.Name = name;
    this.Rollno = rollno;
    this.Marks = marks;
  }

  public String getname() {
    return Name;
  }

  public void setname(String name) {
    this.Name = name;
  }

  public int getrollno() {
    return Rollno;
  }

  public void setrollno(int rollno) {
    this.Rollno = rollno;
  }

  public int getmarks() {
    return Marks;
  }

  public void setmarks(int marks) {
    this.Marks = marks;
  }

  public String CalculateGrade() {
    if (Marks >= 90)
      return "A";
    else if (Marks >= 80)
      return "B";
    else if (Marks >= 70)
      return "C";
    else if (Marks >= 60)
      return "D";
    else
      return "F";

  }
}

public class Main {
  public static void main(String[] args) {
    Student s = new Student("Ram", 1, 90);
    System.out.println("Student Name:" + s.getname());
    System.out.println("Student Rollno:" + s.getrollno());
    System.out.println("Student Marks:" + s.getmarks());
    System.out.println("Student Grade:" + s.CalculateGrade());

  }

}