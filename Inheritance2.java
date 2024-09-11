interface A{
  void displayA();
  }

interface B{
  void displayB();
  }

class C  implements A,B{
  public void displayA(){
    System.out.println("This is class A");
    }
  public void displayB()
  {
    System.out.println("This is class B");
  }
  void displayC(){
    System.out.println("This is class C");
  }
}
public class Main {
  public static void main(String[] args) {
    C obj = new C();
    obj.displayA();
    obj.displayB();
    obj.displayC();
  }

 
}