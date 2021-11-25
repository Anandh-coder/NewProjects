package secondHalfOOPS;

public class ChildBro extends InheritanceBro{
	
	String model;	
	
	public ChildBro(String piece, float gst, float rate, String place) {
		super(gst, rate, place);// super keyword should be the first statement in the child class which inherits base class
								// otherwise java would throw compilation error
		/*
		 * model = piece; tax = gst; bill = rate; // all these variables are inherited
		 * from base class : advantage of inheritance country = place;
		 */
		
		}
	public String toString() {
		this.order();
		return("ur Model name: " + model + " product cost with tax and discound: " +this.discount()+ 
				" u got this discound as u come from: "+ country);
		
	}

}
