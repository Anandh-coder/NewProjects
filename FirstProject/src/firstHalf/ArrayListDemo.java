package firstHalf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//#Iterators
		List<Integer> numericals = Arrays.asList(5,4,8,7,6,1,2,3);
		Iterator it = numericals.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		//#
		List<Integer> plant = new ArrayList<>();
		// List is an interface, Integer is class possibly data type, Arraylist is concrete class 
		
		for(int i = 11;i<15;i++) {
			plant.add(i);			
		}
		System.out.println(plant);
	
		plant.remove(3);
		
		System.out.println(plant.get(2));
		/*
		 * //Enhanced for loop 
		 * for(int i: plant); 
		 * System.out.print(plant);
		 */
	
		LinkedList<String> sapling = new LinkedList<>();
		//if u use List as interface in place of Linked list u wont be able to utilise addfirst method
		//as its a method of LInkedlist concrete class
		sapling.add("reap");
		sapling.addLast("sow");
		sapling.addFirst("YOu");
		sapling.add(2, "what");
		sapling.add("you");
		System.out.println(sapling);
		sapling.removeLast();
		System.out.println(sapling);
		sapling.add("u");
		sapling.addLast("sowagain");
		System.out.println(sapling);
		
		//next collection type is hashset
		Set<String> root = new HashSet<>(4);
		root.add("slow");
		root.add("and");
		root.add("Slow");// this should not be allowed as set dont accept duplicate bt its case sensitive
		root.add("Bro!");
		System.out.println(root);// order is missing as hashset dont honour order of how we added.
		System.out.println("Bro! anedhi undha?" + root.contains("Bro!"));
		
		//other collection called Treeset
		TreeSet<String> branch = new TreeSet<>();
		//string is predefined class
		branch.add("c");
		branch.add("b");
		branch.add("a");
		System.out.println(branch);//automatically sorts as treeset uses its natural property of string sorting
		branch.add("ample");
		branch.add("ball");
		System.out.println(branch);
		}
	

}
