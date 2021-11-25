package finalProject;

import java.util.Scanner;

public class CharArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i=0 ; i<word.length() ; i++) {
			if(word.charAt(i) == '/') {		
				System.out.println("Vellanu");
				
				int quo = Operations.division(word.charAt(i-1), word.charAt(i+1));
				System.out.println(quo);
				char a = word.charAt(i-1);				
				char b = word.charAt(i+1);
				//word.replace(a, (Character) null);
				//word.replace(b, (Character) null);
				word.replace("([0-9])", "");
				//word = word.replace(a, "");
			}			
		
	}
		System.out.println(word);
		sc.close();

}
}
