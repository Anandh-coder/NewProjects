package leftOverOOPSconcepts;

import leftOverOOPSconcepts.EncapsulationwithstaticNestedclasses.Kitchen;
import leftOverOOPSconcepts.EncapsulationwithstaticNestedclasses.hall;

public class EncapsulationwithstaticNestedclassesMain {

	public static void main(String[] args) {
		
		EncapsulationwithstaticNestedclasses out = new EncapsulationwithstaticNestedclasses(10, 20);
		// creating obj for outer class.  out is reference
		EncapsulationwithstaticNestedclasses.Kitchen kit = new EncapsulationwithstaticNestedclasses.Kitchen();	
		kit.space();
		// creating obj for inner class using outer class along
		EncapsulationwithstaticNestedclasses.hall hall = new EncapsulationwithstaticNestedclasses(30, 40).new hall();
		//while calling non static class, u hv to intiate outercls and inner class		
		hall.space();
		

	}

}
