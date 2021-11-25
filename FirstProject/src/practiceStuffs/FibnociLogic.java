package practiceStuffs;

import java.util.Scanner;

public class FibnociLogic {

	public static void Logic(int len) {
		int a,sum,b ;
		a = 0;
		b = 1;
		System.out.print(a + " " + b + " ");
		for(int i=2 ; i<len ; i++) {			
			sum = a+b;
			System.out.print(sum + " ");
			a = b;
			b = sum;			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number upto which u want to see the fibnocci series: ");
		Logic(sc.nextInt());// since the logic and main methods are static, we r directly using it.
							// to call static methods we dont need object instances.
		sc.close();
	}

}
