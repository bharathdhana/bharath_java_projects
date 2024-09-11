import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {  
      System.out.println("Enter a number: ");
      Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-32768  && x<=32767)
            {
            System.out.println("* short");
            System.out.println("* long");
            System.out.println("* int");
        }
        }

        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }
      }
  }
}
    
