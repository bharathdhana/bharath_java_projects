import java.util.Scanner;

class greet {
  String greet() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name:");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
    return name;
  }
}

public class Main {
  public static void main(String[] args) {
    greet g = new greet();
    g.greet();
  }

}