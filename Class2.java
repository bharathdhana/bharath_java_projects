class Calculator
  {
  int add(int a,int b)
    {
      int sum = a+b;
      return sum;
    }
    
  }

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Addition of two numbers is: "+calc.add(10,20));
    
    
  }

 
}