class Rectangle{
  int width;
  int length;
  Rectangle(int w,int l)
  {
    this.length=l;
    this.width=w;
  }
  void Area()
  {
    int area=length*width;
    System.out.println("Area of the Rectangle is:"+area);
  }
}
public class Main {
  public static void main(String[] args) {
    Rectangle r=new Rectangle(10,5);
    r.Area();
  }

}