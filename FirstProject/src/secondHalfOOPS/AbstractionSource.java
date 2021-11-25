package secondHalfOOPS;

public class AbstractionSource {

	public static void main(String[] args) {
		
		Abstraction gc = new GwkClient("Jorge", 30, 3);
		Abstraction bc = new BcroadClient("Kutty",20, 4 );
		// right side is for base abstract class reference as we cant create obj for abstract class
		// so we create for the child class which extends the abstract class
		gc.checkIn();
		gc.checkout();
		bc.checkIn();
		bc.checkout();
		

	}

}
