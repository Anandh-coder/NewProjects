package practiceStuffs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringArrayReversing {
	
	static List<String> reversed = new ArrayList<>(); 
	static void reverse(List<String> wordy) {
		for(int i=0; i<wordy.size(); i++) {
			String reverse= "";
			for(int j=wordy.get(i).length() ; j>0 ; j--) {
				reverse = reverse+wordy.get(i).charAt(j-1);
			}
			reversed.add(reverse);			
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many words u would pass");
		int size = sc.nextInt();
		sc.nextLine();// this is required as string input it wouldnt take after nextInt as we hit enter in the console
					  //so that new line get processed or considered by nextInt so as a result it wont consider 
					  //the acutual input or it wont even allow us to enter the input.
		List<String> words = new ArrayList<>();
		for(int i=0; i<size; i++) {
			String ask = sc.nextLine();
			words.add(ask);
		}
		sc.close();
		System.out.println(words);
		
		reverse(words);

	}

}
