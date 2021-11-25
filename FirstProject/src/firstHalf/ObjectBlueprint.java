package firstHalf;

public class ObjectBlueprint {
	
	String customerName;
	int sizes;
	String style;

	public ObjectBlueprint(String name, int size, String outfit) {
		customerName = name;
		sizes = size;
		style = outfit;
	}
	
	/*
	 * public void setcustomerName(String name) { customerName = name; }
	 * this statment does the same work of line 10 to 12
	 */
	public String getcustomerName() {
		return customerName;
	}
	
	public int getsizes() {
		return sizes;
	}
	
	public String getstyle() {
		return style;
	}
	
	public String toString() {
		return("Client Name: "+ this.getcustomerName()+" Her measurements: "+ 
				this.getsizes()+" her Outfit style: "+this.getstyle());
	}

	public static void main(String[] args) {
		ObjectBlueprint Gajuwakacustomer = new ObjectBlueprint("Mounika", 32, "chudi");
		
		/*
		 * System.out.println(Gajuwakacustomer.getcustomerName());
		 * System.out.println(Gajuwakacustomer.getsizes()); Instead of writing these nd making main method verbose
		 * 													we use tostring method
		 */ 
		System.out.println(Gajuwakacustomer.toString());
		

	}

}
