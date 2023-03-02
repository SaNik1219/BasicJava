package LogicalClassAndMethod;

public class Product {

	String name;
	int quantity;
	int price;

	public void AcceptDetails(String n, int q, int p) {
		 name = n;
		 quantity = q;
		 price = p;
	}

	public void Display() {
		System.out.println(name + " " + quantity + " " + price);
	}

	public static void main(String[] args) {

		Product pr = new Product();
		pr.AcceptDetails("Sandip", 2, 340000);
		pr.Display();

	}

}
