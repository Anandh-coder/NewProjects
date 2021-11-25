package secondHalfOOPS;

public class MainClassforInheritance {

	public static void main(String[] args) {
		
		ChildBro Indian = new ChildBro("Redme", 500, 10000, "India");
		ChildBro American = new ChildBro("Samsung", 500, 10000, "America");
		System.out.println(Indian.toString());
		System.out.println("Thanks for the order, Please visit again!");
		System.out.println(American.toString());
		System.out.println("Thanks for the order, Please visit again!");
		

	}

}
