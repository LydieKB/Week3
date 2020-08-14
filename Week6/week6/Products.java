package week6;
public class Products {

	public int total(int qty, double price) {
	int total = (int) (qty * price); 
    return total;
  }
    
  public static void main (String arg []){
	String name = "chevrolet " ;
	int qty = 30 ;
	double price = 55000.50 ;
	  Products obj = new Products ();
	  System.out.println(obj.total ( 30, 5500.50));
	 System.out.println("the name of the car is " + name + " I have " + qty + " each cost "+ price);

  }
}