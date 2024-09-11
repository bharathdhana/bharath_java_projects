class Car
  {
    String name;
    void Print()
    {
      System.out.println("Name of the Car is: "+name);
    }
  }
public class Main {
  public static void main(String[] args) {
    Car myCar= new Car();
    myCar.name = "BMW M4";
    myCar.Print();
  }
}