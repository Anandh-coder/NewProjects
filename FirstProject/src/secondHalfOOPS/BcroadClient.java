package secondHalfOOPS;

public class BcroadClient extends Abstraction {
	
	int bill;
	public BcroadClient(String Cname, int room, int stay) {
		name = Cname;
		roomId = room;
		days = stay;
	}
	
	public void checkIn() {
		System.out.println("Hello "+name+" Here is your bill!");
	}
	
	public void checkout() {
		if(roomId == 20) {
			bill = 650*days;
		}else {
			bill = 750*days;
		}
		
		System.out.println(bill);
	}	
	
}
