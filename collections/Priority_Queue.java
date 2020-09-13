package main.collections;
import java.util.*;

public class Priority_Queue {
	
	public static void main(String[] args) {
		
		Queue<String> colours = new PriorityQueue<String>();
		colours.add("Silver");
		colours.add("Gold");
		colours.add("Red");
		colours.add("Blue");
		System.out.println(colours);
		
		for(String s : colours)
			System.out.println(s);
		
		Queue<String> colours_two = new PriorityQueue<String>();
		colours_two.addAll(colours);
		
		colours.offer("Yellow");
		System.out.println(colours);
		
		colours_two.removeAll(colours_two);
		colours_two.clear();
		
		System.out.println("Number of elements: " + colours.size());
		
		for(String s : colours)
			System.out.println(colours_two.contains(s) ? "Yes" : "No");
		
		// retrieve without removing
		System.out.println("First element: " + colours.peek());
		
		// retrieve and remove first element
		System.out.println("Removes the first element: " + colours.poll());
		
		// convert queue to array
		String[] array = new String[colours.size()];
		colours.toArray(array);
		
		// convert to list
		List<String> arraylist = new ArrayList<String>(colours);
		System.out.println(arraylist);
		
		String rep = colours.toString(); // toString must be overridden
		System.out.println(rep);
		
		String string = null;
		while((string = colours.poll()) != null) {
			System.out.print(string + " ");
		}
		
		
		
		
		
		
		
		
	}

}
