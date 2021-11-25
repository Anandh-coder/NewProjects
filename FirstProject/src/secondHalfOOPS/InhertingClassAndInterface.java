package secondHalfOOPS;

public class InhertingClassAndInterface extends CarrageBag implements InterfaceBase{
	
	// 1 class can implement multiple interfaces
		// same way 1 class can inherit class and interface combo
		// in which extends should come first followed by implements keyword for interfaces
	String customer;
	int csets;
	int hsets;
	int cbill;
	int hbill;
	float tbill;
	public InhertingClassAndInterface(String type, int sets, int hcount) {
		customer = type;
		csets = sets;
		hsets = hcount;
	}
	
	@Override
	public void clothing() {
		if(csets >0 && csets<10) {
			cbill = csets *300;
		}
		
	}

	@Override
	public void household() {
		if(hsets >0 && hsets<20) {
			hbill = hsets *450;
		}
		
	}
	
	public String toString() {
		tbill = cbill+hbill+tax;
		return("Dear "+customer+", Here is your total bill "+tbill);		
	}
	
	
	
	

}
