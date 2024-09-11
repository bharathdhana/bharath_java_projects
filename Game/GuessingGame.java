
class NumberGenerator {

  private final int minNumber;
  private final int maxNumber;

  public NumberGenerator(int minNumber, int maxNumber) {
    this.minNumber = minNumber;
    this.maxNumber = maxNumber;
  }

  public int generateRandomNumber()

  {
    return (int) (Math.random()) * (maxNumber - minNumber + 1) + minNumber;
  }
}
