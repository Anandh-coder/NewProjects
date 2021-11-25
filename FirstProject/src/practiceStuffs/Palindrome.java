package practiceStuffs;

import java.util.Scanner;

public class Palindrome {

	char reverse;
	int border;
	boolean flag = false;
	public Palindrome(String nextLine) {
		for(int i=0 ; i < nextLine.length() ; i ++) {
				border = nextLine.length()-1 ;
				if(nextLine.charAt(i) == nextLine.charAt(border-i)) {
					continue;
				}else {	
					flag = true;
					break;
				}			
		}
		if(!flag) {
			System.out.println("Its a Palindrome word! ");
		}else
		
		System.out.println("Not a palindrome dear");
		
	}	

	public Palindrome(String another, int length) {
		String b = ""; String a = another;
		for(int i=length ; i>0 ; i--) {
			b = b+a.charAt(i-1);			
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Hurry! its a palindrome");
			System.out.println("okk");
					}
		else
			System.out.println("NOt a palindrome yaar");
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number or digit to check its a palindrome or not");
		// palindrome words Neveroddoreven. madam
		new Palindrome(sc.nextLine());
		String another = sc.nextLine();
		int length = another.length();
		new Palindrome(another, length);
		sc.close();
	}

}
