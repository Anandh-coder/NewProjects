package practiceStuffs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersArray {	
	
	int remainder;
	boolean flag = false;
	List<Integer> primes = new ArrayList<>();
	ArrayList<Integer> NonPrimes = new ArrayList<>();
	public PrimeNumbersArray(int[] inputs) {
		for(int i=0 ; i<inputs.length ; i++) {
			if(inputs[i] > 0) {
				for(int j= 2 ; j <= inputs[i]/2 ; j++) {
					remainder = inputs[i]%j;
					if(remainder == 0) {
						flag = true;
						break;
					}
				}if(!flag) {
					primes.add(inputs[i]);			
			
				}else {
					NonPrimes.add(inputs[i]);					
					flag = false;
				}
				
			}else
				System.out.println("Please enter number greater than 0");
		}
		System.out.println("Prime Numbers: " + primes);
		System.out.println("Non Prime Numbers: " + NonPrimes);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the array of numbers you want to enter");
		int length = sc.nextInt();		
		int inputs[] = new int[length];
		for(int i=0 ; i<length ; i++) {
			inputs[i] = sc.nextInt();
		}
		PrimeNumbersArray pna = new PrimeNumbersArray(inputs);

	}

}
