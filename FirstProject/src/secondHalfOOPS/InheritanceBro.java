package secondHalfOOPS;

public class InheritanceBro {

	protected float tax;
	protected float rate;
	protected float bill;
	protected String country;
	
	public InheritanceBro(float gst, float cost, String place){
		tax = gst;
		rate = cost;
		country = place;
	}
	public void order(){
		bill = tax+rate;		
	}
	
	public float discount() {
		if(country == "India") {
			return bill/5;
		}else {
			return bill/2;
		}
		
	}
	
}
