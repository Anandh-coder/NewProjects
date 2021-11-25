package firstHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class MapCollectionInstance {

	public static void main(String[] args) {
		
		String[] Outfits = {"dress", "jean", "tshit", "dupatta"};
		Map<Integer, String> field = new HashMap<>();
		// Map is interface and integer & string r predefined classes, hashmap is concrete class
		// hashmap key uses set logic as the keys should be unique
		field.put(10, "Mounika");
		field.put(11, "Sai");
		field.put(12, "Lakshmi");
		System.out.println(field);
		
		if(field.containsKey(11)) {
			System.out.println(field.get(11));
			field.put(11, "Sai Kumar");
			System.out.println(field);
		}
		
		field.put(13, "Rao");
		for(int i: field.keySet()) {
			System.out.println(field.get(i));
		}
		
		//lets look at TreeMap
		TreeMap<Integer, String> garden = new TreeMap<>();
		garden.put(21, "Jan");
		garden.put(42, "Feb");
		garden.put(13, "March");
		System.out.println(garden);// does a natural sorting property of treeset
		
		//stack 
		// stack is techniqally a list bt we should nt say its a list, its just kind of list as it extends list interface
		//we use stack when we want LIFO[last in first out] representation
		//eg stack of plates, special type of collections
		//to know more visit java.api
		
		Stack<String> leaf = new Stack<>();
		leaf.push("well");
		leaf.push("how"); //push method to add element to stack
		leaf.push("you doing");
		System.out.println("original stack: "+ leaf);
		System.out.println("removing last entry of stack: "+leaf.pop());// pop method removes the top item of stack
		System.out.println("latest top element now: "+leaf.peek());
		
		//Queue - another collection
		//Property - FIFO[first in first out]
		// Priority queue uses its natural sorting order
		
		Queue<String> petal = new PriorityQueue<>(4);
		for(String i: Outfits) {
			petal.add(i);
		}
		
		System.out.println("making queue: "+petal);// wont print the order we add/ it wont uses its natural sorting as here SOP internally calls .toString method which dont know how to sort
		System.out.println("removing first element: "+petal.remove());// removes the head entry like first element
		System.out.println("Q after removing the first: "+petal);
		petal.poll();
		System.out.println(petal);
		
		
		
		
		
		
		
	}

}
