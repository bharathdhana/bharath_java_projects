import java.util.*;

public class Game{
  public static void main(String[] args)
  {
    Scanner scanner =new Scanner(System.in);
    int minNumber=1;
    int maxNumber=100;
    int numberofAttempts=5;

    NumberGenerator generator=new NumberGenerator(minNumber,maxNumber);
    
    int target=generator.generateRandomNumber();
    int guessCount=0;
    boolean isGameOver=false;
    while(!isGameOver && guessCount<numberofAttempts)
      {
        System.out.printf("Guess #%d:Enter a number between %d and %d:",guessCount+1,minNumber,maxNumber); 
        int guess = scanner.nextInt();
        if(guess==target)
        {
          System.out.print("Congrats! you guessed the number Correctly!");
          isGameOver=true;
        }
        else if(guess<target)
        {
          System.out.print("Your guess is too low. Try again.");    
        }
        else
        {
          System.out.print("Your guess is too high. Try again!");
        }
        guessCount++;
      }
    if(!isGameOver)
    {
      System.out.printf("you ran out of guesses,the number was %d\n",target);
      
    }
    scanner.close();
  }
}



