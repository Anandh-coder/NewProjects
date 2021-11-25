package practiceStuffs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingLogic {
	
	float temp;
	
	public SortingLogic(float[] entries) {
	//float[] sorted = new float[entries.length];	
	//List<Float> sortedL = new ArrayList<>(entries.length);
	 // here u hv to give Float as collections use wrapper class nt primitive data types, float dont work.
		for(int i=0 ; i < entries.length ; i++) {
			for(int j=i+1 ; j < entries.length ; j++) {
				
				if(entries[i] > entries[j]) {
					temp = entries[i];
					entries[i] = entries[j];
					entries[j] = temp;
				}
				
			}			
		}
		
		System.out.println("Numbers after sorting: ");
		for(int i=0 ; i < entries.length ; i++) {			
			System.out.print(entries[i] + " ");
		}	
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please enter the no of elements u gonna enter");	
		int len = sc.nextInt();
		float[] entries = new float[len];
		for(int i=0 ; i < len ; i++) {
			entries[i] = sc.nextFloat();
		}
		SortingLogic sl = new SortingLogic(entries);

	}

}
