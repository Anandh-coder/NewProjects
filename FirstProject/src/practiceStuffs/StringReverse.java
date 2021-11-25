package practiceStuffs;

import java.util.Scanner;

public class StringReverse {
	
	static String word;
	public static void StringReverse(String input) {
		word = input;
		for(int i= word.length()-1; i > 0 ; i-- ) {
			char Rword = word.charAt(i);
			System.out.print(Rword);
		}
	}
	
	public static void enhancedloop(String verbage) {
		int wordlength = verbage.length();
		char[] letters = new char[wordlength];
		for(int i=0;i<wordlength;i++) {
			letters[i] = verbage.charAt(i);
		}
		
		for(char c: letters) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word you want to reverse: ");
		String value = sc.nextLine();
		StringReverse(value);
		enhancedloop(value);
		sc.close();
		
	}

}
