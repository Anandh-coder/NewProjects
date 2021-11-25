package finalProject;

import java.util.Scanner;

public class ReadInput {
	static String inputLine;
	
	public static String read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the expression for eg: 2+3*9-5");
		inputLine = sc.nextLine();		
		sc.close();
		return inputLine;
	}
	
	public static void operations() {
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<inputLine.length() ; i++) {
			if(inputLine.charAt(i) == '/') {				
				int quo = Operations.division(inputLine.charAt(i-1), inputLine.charAt(i+1));
				char a = inputLine.charAt(i-1);				
				char b = inputLine.charAt(i+1);
				inputLine.replace(a, (Character) null);
				inputLine.replace(b, (Character) null);
				//inputLine.replace("([0-9])", "");
				//inputLine = inputLine.replace(a, "");
			}
		}
	}
	
	
	

}
