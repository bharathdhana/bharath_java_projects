class Counter {
  static int counter = 0;

  void incrementCounter() {
    System.out.println("Counter value is " + counter);
    counter++;
  }
}

public class Main {
  public static void main(String[] args) {
    Counter c = new Counter();
    for (int i = 0; i <= 5; i++) {
      c.incrementCounter();
    }
  }

}