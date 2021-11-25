package leftOverOOPSconcepts;

public class MORMain {

	public static void main(String[] args) {
		
		MethodOverRiding m1 = new MethodOverRiding("Majji", 130);//MethodOverRiding is base class
		m1.bpcheckup();
		MethodOverRiding child = new MORClich("Mounika", 140, 24);// wtever on right side, that only governs the methods
																  //which means child bpcheck method gets called
		child.bpcheckup();

	}

}
