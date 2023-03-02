package LogicalClassAndMethod;

public class Car {

	int id;
	String name;
	int price;
	String color;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getsColor() {
		return color;
	}

	public static void main(String[] args) { 
		Car c = new Car();
		c.setId(101);
		c.setName("Mercedez");
		c.setPrice(9800000);
		c.setColor("Black");

		System.out.println(c.getId() + " " + c.getName() + " " + c.getPrice() + " " + c.getsColor());
	}

}
