package leftOverOOPSconcepts;

public class Factorial {
	
	int factorial = 1;
	Factorial(int number){
		for(int i=1;number>0;number--) { //for(int i; number>0; number--) preferred
			factorial = factorial * number;	
			System.out.println(number);
		}
				
		System.out.println("Factorial value of "+factorial);
		
	}
	
	//Recurrsion
	
	int Rfactorial(int number) {
		if(number == 1) {
			return 1;
		}else {
			return(number * Rfactorial(number-1) );
		}
		
		// naku pedhaga ardham kaledhu
	}

	public static void main(String[] args) {
		
		Factorial f = new Factorial(5);		
		System.out.println(f.Rfactorial(6));

	}

}
