package LogicalClassAndMethod;

public class Student {
	int id;
	String name;
	int subject1;
	int subject2;
	int subject3;

	public void Details(int i, String n, int s1, int s2, int s3) {
		id = i;
		name = n;
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}

	public void Display() {

		System.out.println(id + " " + name + " " + subject1 + " " + subject2 + " " + subject3);
	}

	public static void main(String[] args) {

		Student st = new Student();
		st.Details(101, "Nikita", 76, 65, 47);
		st.Display();

	}

}
