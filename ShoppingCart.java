import java.util.*;

class Product{
  String name;
  double price;
  int quantity;
  Product(String name, double price, int quantity)
  {
    this.name = name;
    this.price=price;
    this.quantity = quantity;
  }
 public String getname()
  {
    return name;
  }
  public double getprice()
  {
    return price;
  }
  public int getquantity()
  {
    return quantity;
  }
  public void setname(String name)
  {
    this.name = name;
  }
  public void setprice(double price)
  {
    this.price = price;
  }
  public void setquantity(int quantity)
  {
    this.quantity = quantity;
  }
  
}


class ShoppingCart{
  private List<Product> products;

  public ShoppingCart()
  {
    products = new ArrayList<Product>();
  }

public void addProduct(Product product)
  {
    products.add(product);
  }
public double CalculateTotal()
{
  double Totalprice=0.0;
  for(Product product:products)
    {
      Totalprice += product.getprice()*product.getquantity();
    }
  return Totalprice;
}
public String GenerateRecipt()
  {
  StringBuilder receipt=new StringBuilder();
  for(Product product:products)
    {
      receipt.append(product.getname())
         .append(" - Quantity: ")
         .append(product.getquantity())
         .append(", Price: $")
         .append(product.getprice())
         .append("\n");
    }
  //receipt.append(" - Total Price: $" + CalculateTotal());
  return receipt.toString();
  }

}  
class Customer{
 public String name;
 public ShoppingCart cart;
  Customer(String name){
    this.name=name;
    this.cart=new ShoppingCart();
  }
  public String getname()
  {
    return name;
  }
  public ShoppingCart getcart()
  {
    return cart;
  }
}

public class Main {
  public static void main(String[] args) {
    Product Apple=new Product("Apple",0.5,10);
    Product Orange=new Product("Orange",0.75,5);
    Product Milk=new Product("Milk",1.25,2);
  

  Customer customer=new Customer("John");
  
  customer.getcart().addProduct(Apple);
  customer.getcart().addProduct(Orange);
  customer.getcart().addProduct(Milk);

  double totalPrice = customer.getcart().CalculateTotal();
  System.out.println("Total Price: $" + totalPrice);

  String receipt = customer.getcart().GenerateRecipt();
  System.out.println(receipt);
  
}}