package practiceStuffs;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortingListwithReq {
	
	static List<Integer> values = new LinkedList<>();
	static List<Integer> even = new LinkedList<>();
	static List<Integer> odd = new LinkedList<>();
	static List<Integer> output = new LinkedList<>();
	public static void SortingListwithReq(List<Integer> valuestosort) {
		for(int i=0;i<valuestosort.size();i++) {
			if(valuestosort.get(i)%2 == 0) {
				even.add(valuestosort.get(i));
			}else{
				odd.add(valuestosort.get(i));
			}
		}
		even.sort(null);
		odd.sort(null);
		
		System.out.println(even);
		System.out.println(odd);
	}
	
	public static void finaloutput() {
		boolean evenissmall=false;
		int x= even.size();
		int y= odd.size();
		
		if(x<y) {
			evenissmall = true;
			for(int i=0;i<even.size();i++) {
				if(even.get(i)>odd.get(i)) {
					output.add(odd.get(i));
					output.add(even.get(i));
				}else {
					output.add(even.get(i));
					output.add(odd.get(i));
				}
			}
		}else {
			for(int i=0;i<odd.size();i++) {
				if(odd.get(i)>even.get(i)) {
					output.add(even.get(i));
					output.add(odd.get(i));
				}else {
					output.add(odd.get(i));
					output.add(even.get(i));
				}
			}
		}
		if(evenissmall == true) {
			int z= y-x;
			for(int i=0;i<z;i++) {
				
				 int leftover = odd.get(even.size()+i);
				 output.add(leftover);
				 
			}
		}else {
			int z = x-y;
			for(int i=0;i<z;i++) {
				int leftover = even.get(odd.size()+i);
				output.add(leftover);
			}
		}
		System.out.println(output);
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range Gentleman");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			values.add(sc.nextInt());
		}
		System.out.println(values);
		SortingListwithReq(values);
		sc.close();
		finaloutput();
		
	}

}
