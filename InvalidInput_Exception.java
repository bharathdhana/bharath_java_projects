import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.print("Enter the integer :");
      int n = sc.nextInt();
      System.out.print("Entered value:"+n);

    } catch (InputMismatchException e) {
      System.out.println("Invalid Input, Please enter a valid input\n" + e);
    }
  }

}