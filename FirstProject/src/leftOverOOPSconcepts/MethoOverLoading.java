package leftOverOOPSconcepts;

public class MethoOverLoading {
	
	// this is method overloading where methods share the same bt the no of arguments or type of arguments varies.
	
	int result;	
	public MethoOverLoading(int x, int y) {
		
		result = x*y;		
	}
	
	double multiply(int x, double y) {
		return x*y;
	}
	
	int multiply(int x, int y, int z) {
		return x*y*z;
	}
	
	float multiply(int x, int y) {
		return x*y;
	}

	public static void main(String[] args) {
		MethoOverLoading m1 = new MethoOverLoading(5,4);
		System.out.println(m1.multiply(5, 10.55));

	}

}
