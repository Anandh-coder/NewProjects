package secondHalfOOPS;

public class GwkClient extends Abstraction{	
	
	int bill;
	public GwkClient(String CName, int room, int stay) {
		name = CName;
		roomId = room;
		days = stay;
	}
	
	public void checkIn() {
		System.out.println("Hello "+name+" Here is your bill! ");	
	}
	
	public void checkout() {
		if(roomId == 10) {
			bill=500*days;
		}else {
			bill = 600*days;
		}
		System.out.println(bill);
	}
	
	
	}
