package secondHalfOOPS;

public class ClasswithMultiInterf extends CarrageBag implements InterfaceBase, Discountt{
	
	String customer;
	int csets;
	int hsets;
	int cbill;
	int hbill;
	float tbill;
	public ClasswithMultiInterf(String type, int sets, int hcount) {
		customer = type;
		csets = sets;
		hsets = hcount;
	}
	
	@Override
	public void clothing() {
		if(csets >0 && csets<10) {
			cbill = csets *300;
		}else {
			cbill = csets *400;
		}
		
	}

	@Override
	public void household() {
		if(hsets >0 && hsets<20) {
			hbill = hsets *450;
		}else {
			hbill = hsets *500;
		}
		
	}
	
	@Override
	public void Discountonprice() {
		if(tbill>1000) {
			System.out.println("Hurry! U got discount");
			tbill = tbill - Discount;
			System.out.println("Bill after discount:"+tbill);
		}else {
			System.out.println("You are not eligible for discount");
		}
		
	}
	
	public String toString() {
		tbill = cbill+hbill+tax;
		return("Dear "+customer+", Here is your total bill "+tbill);		
	}

}
