package leftOverOOPSconcepts;

public class MethodOverRiding {
	
	int beat;
	public MethodOverRiding(String name, int bp) {
		
		beat = bp;
		System.out.println("Dear , ");
	}
	
	public void bpcheckup() {
		if(beat>110 && beat<120) {
			System.out.println("Ur bp is normal with beat "+beat);
		}else {
			System.out.println("Ur bp is high with beat"+beat);
		}		
	}

}
