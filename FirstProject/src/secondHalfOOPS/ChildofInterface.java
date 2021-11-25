package secondHalfOOPS;

public class ChildofInterface implements InterfaceBase{
	
	String customer;
	int clothset;
	int hhsetcount;
	float cbill;
	float hbill;
	float tbill;
	public ChildofInterface(String type, int sets, int hhcount) {
		customer = type;
		clothset = sets;
		hhsetcount = hhcount;
	}
	@Override // here its coming override by IDE bcoz we gonna use the method that declared in the interfacebase class
	// which is some sort of method overriding.
	public void clothing() {
		if(clothset > 0 && clothset <=10) {
			cbill = clothset * 500;
		}else {
			cbill = clothset * 700;
		}
		
	}

	@Override
	public void household() {
		if(hhsetcount >0 && hhsetcount<20) {
			hbill = hhsetcount * 300;
		}else {
			hbill = hhsetcount * 400;
		}
		
	}
	
	public String toString() {
		tbill = cbill+hbill+tax;
		return("Dear "+customer+", here is you total bill! "+tbill);
	}
	

}
