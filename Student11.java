class Student {
  String name;      //Instance variable can be used anywhere in the class 
  int rollno; 
  char Grades;
  static String classTeacher="Mr.james";  
  Student(String name, int rollno, char Grades) {  //local variable
    this.name = name;      //this keyword denotes reference of the variable
    this.rollno = rollno;
    this.Grades = Grades;
  }

  void display() {
    System.out.println("ClassTeacher:"+Student.classTeacher);
    System.out.println("Student Data:");
    System.out.println("Name: " + name + "\nRollno: " + rollno + "\nGrade: " + Grades);
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {
    Student s = new Student("Ram", 1001, 'A');
    Student ss= new Student("Shyam", 1002, 'B');
    //System.out.println("ClassTeacher:"+Student.classTeacher);
    ss.display();
    s.display();
  }
}


