
public class Main {
  public static void main(String[] args) {
    
    int number=5;
    int fact = calcFactorial(number);
    System.out.println("Factorial of " + number + " is " + fact);   
}
      static int calcFactorial(int number)
      {
      if(number==0 || number==1)
    {
      return 1; 
    }
    else
    {
      return number*calcFactorial(number-1);
    }
  }
}