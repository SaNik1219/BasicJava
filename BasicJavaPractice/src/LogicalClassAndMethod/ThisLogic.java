package LogicalClassAndMethod;

class ThisLogic {
	int a;
	int b;

	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void showData() {
		System.out.println("Value of A =" + a);
		System.out.println("Value of B =" + b);
	}

	public static void main(String args[]) {
		ThisLogic ts = new ThisLogic();
		ts.setData(2, 3);
		ts.showData();
		ts.Show();
	}
	
	public void Show(){
		System.out.println("I am Unable To Process This Keyword Here...:-(");
	}
}