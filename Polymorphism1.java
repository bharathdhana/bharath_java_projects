class Shape {
  void display() {
    System.out.println("Calculating Shapes...");
  }

}

class Circle extends Shape {
  void calculateArea(double radius) {
    System.out.println("Area of circle is " + 3.14 * radius * radius);

  }

}

class Rectangle extends Shape {
  void calculateArea(int length, int breadth) {
    System.out.println("Area of Rectangle is:" + length * breadth);
  }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.display();
    circle.calculateArea(5.0);
    Rectangle rectangle = new Rectangle();
    rectangle.display();
    rectangle.calculateArea(10, 20);
  }
}