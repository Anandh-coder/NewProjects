package practiceStuffs;

import java.util.Scanner;

public class PrimeNumber {	
	
	PrimeNumber(int value){
		int input = value;
		int remainder = 1;
		if( input>0 ) {
			for(int i=2 ; i < input ; i++) {
				// for(int i=2 ; i < input/2 ; i++) this also works because a No is not divisible by more than its half.
				remainder = input%i ;
				if(remainder == 0) {
					System.out.println("Entered Number is not a prime Number");
					break;
				}
			}if(remainder > 0)
				System.out.println("Its a Prime Number!");	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to its prime property: ");
		// for new line use '\n'
		PrimeNumber pn = new PrimeNumber(sc.nextInt());
		
		/* this logic dont work as we predefine which type of input user has to enter in java bt python based on the value it takes which type of data user entered
		 * int value; do { value = sc.nextInt(); PrimeNumber pn = new
		 * PrimeNumber(value); }while(value == 0);
		 */
		
		
		

	}

}
