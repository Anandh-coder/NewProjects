package leftOverOOPSconcepts;

public class MORClich extends MethodOverRiding{
	
	int p_age;
	int Hbeat;
	public MORClich(String name, int beat, int age) {
		super(name, beat);
		p_age = age;
		Hbeat = beat;
		System.out.print(name);
	}
	
	//@Overriding
	// in overriding, methods share the same name bt between classes and with different implementations.
	public void bpcheckup() {
		if(p_age > 18 && p_age < 30) {
			System.out.println(" Based on ur age, ur bp is fine with: "+Hbeat);
		}else {
			System.out.println("Based on ur age, ur bp is concerned with: "+Hbeat);
		}		
	}

}
