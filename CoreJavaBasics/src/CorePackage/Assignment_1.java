package CorePackage;
public class Assignment_1 {
	int age;
	int roll_no;
	int id= 5;
	
	public void display1() {
		
		System.out.println("Hello Everone ...");
	}
    public void display2() {
		
		System.out.println("Selenium is very easy ...");
	}

	public static void main(String[] args) {
		Assignment_1 deep = new Assignment_1();
		deep.display1();
		deep.display2();
		deep.age=20;
		deep.roll_no=21;
		int ids = deep.id;
		System.out.println("Syso is used for printing any value ...");
		System.out.println(deep.age);
		System.out.println(deep.roll_no);
		System.out.println(ids);
		}

}
