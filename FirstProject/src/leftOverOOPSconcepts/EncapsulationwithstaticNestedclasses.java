package leftOverOOPSconcepts;

public class EncapsulationwithstaticNestedclasses {
	
	static private int length;
	static private int width;
	static int space = 0;
	int rooms = 1;
	int trooms;
	public EncapsulationwithstaticNestedclasses(int len, int wid) {
		length = len;
		width = wid;
		// Method local class logic
		// u can create class within any one method so as constructor is a kind of method, using it
		
		class house{
			void houseinputs() {
				System.out.println("Your House contains");				
			}
		}
		// u have to create obj and ref for class within this method so that when this method gets called
		// this class gets initiated automatically
		house h = new house();
		h.houseinputs();
	}
	static class Kitchen {
		//space = length + width;
		// this is giving compilation error for somereason bt nt sure y. same statement working inside a method of da class
		void space() {
			space = length * width;
			System.out.println("Kitchen space: "+space);
			//System.out.println(" with rooms "+rooms); this gets compilation error as static class can only be able
													// to access static variables.
		}
		
		
	}
	// Non static class
	class hall{
		
		void space() {
			space = length * width+1; // non static class can access anything[static and non static variables]
			trooms = rooms + 1;
			System.out.println("Total space of hall: "+space);
			System.out.println(" with rooms "+trooms);
		}
		
	}

}
