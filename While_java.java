import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the number :");
      int n = sc.nextInt();

      if (n == -1) {
        System.out.println("Exiting the Program..");
        break;
      }
      if (n % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("Odd");
      }

    }

  }
}