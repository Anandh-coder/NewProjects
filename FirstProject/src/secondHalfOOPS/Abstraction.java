package secondHalfOOPS;

public abstract class Abstraction {
	
	int roomId;
	String name;
	int days;
	
	
	void exitmessage() {
		System.out.println("Thanks for visiting!");
	}
	abstract void checkIn();
	abstract void checkout();
	

}
