package LogicalClassAndMethod;

public class Method1 {
	
	public void Fact(int n){
		for(int i = 1;i<=n;i++) {
			 if(n%i==0) {
				 System.out.println(i);
			 }
		}
	}

	public static void main(String[] args) {
		Method1 m1= new Method1();
		m1.Fact(15);
	}

}
