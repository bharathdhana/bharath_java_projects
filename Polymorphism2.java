class Animal {
  void display() {
    System.out.println("Pet Animals:");
  }
}

class Dog extends Animal {
  void makeSound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  void makeSound() {
    System.out.println("Cat meows");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.display();
    dog.makeSound();
    Cat cat = new Cat();
    cat.makeSound();
  }
}