 class Animal{
  void makeSound(){
    System.out.println("The animal makes a sound");
  }
 }
class Dog extends Animal
{
  void makeSound(){
    System.out.println("The dog barks");
  }
}
public class Main {
  public static void main(String[] args) {
      Dog d = new Dog();
      d.makeSound();
    //Method Overriding Happens here
      Animal a = new Animal();
      a.makeSound();
  }

  
}