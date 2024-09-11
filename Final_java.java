class Circle {
  final double Pi = 3.14159265359;
  double radius;

  Circle(double r) {
    radius = r;
  }

  void calculateArea() {
    System.out.println("Area of circle is: " + Pi * radius * radius);
  }
}

public class Main {
  public static void main(String[] args) {
    Circle c = new Circle(5.0);
    c.calculateArea();
  }

}