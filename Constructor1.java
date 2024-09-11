class Person{
  int age;
  String name;
  Person(String name,int age)
  {
    this.name=name;
    this.age=age;
  }
  void display()
  {
    System.out.println("Name of the Person:"+name);
    System.out.println("Person's Age:"+age);
  }
}
public class Main {
  public static void main(String[] args) {
    Person p=new Person("Bharath",24);
    p.display();   
  }
}