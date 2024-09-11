abstract class Members{
  abstract void Message();
}
class Student extends Members{
  public void Message(){
    System.out.println("This is our student class");
  }
}
class Teacher extends Members{
  public void Message(){
    System.out.println("This is our Teacher class");
  }
}
public class Main {
  public static void main(String[] args) {
    Members members=new Student();
    members.Message();
    members =new Teacher();
    members.Message();
  }
}