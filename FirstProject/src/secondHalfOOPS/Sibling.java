package secondHalfOOPS;

public class Sibling extends InheritanceBro{
	
	protected String piece;
	public Sibling(String model, float gst, float cost, String area) {
		super(gst, cost, area);
		
	}
	
	public String toString() {
		this.order();
		return("Phone model: "+piece+" YOur bill which includes discound and tax"+this.discount()+
				" Bill seems not familiar but that depended on your country");
	}
	
}
