package main.collections;

import java.util.*;

public class Tree_Set {

	public static void main(String[] args) {

		Set<String> materials = new TreeSet<String>();
		materials.add("Oak");
		materials.add("Mahogany");
		materials.add("Cherrywood");
		System.out.println(materials);

		Iterator<String> it = materials.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		TreeSet<String> wood = new TreeSet<String>();
		wood.addAll(materials);

		Iterator<String> rit = wood.descendingIterator();
		while (rit.hasNext())
			System.out.println(rit.next());

		System.out.println("First element: " + wood.first());
		System.out.println("Last element: " + wood.last());

		Set<String> clone = (TreeSet<String>) wood.clone();
		System.out.println(clone);

		System.out.println("Number of elements: " + clone.size());

		for (String s : wood)
			System.out.println(clone.contains(s) ? "Yes" : "No");

		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(7);
		numbers.add(18);
		numbers.add(21);
		numbers.add(27);
		numbers.add(34);
		// find all numbers less than 7 (head set)

		/*
		 * Set<Integer> treeheadset = new TreeSet<Integer>(); treeheadset =
		 * numbers.headSet(7); Iterator<Integer> num_it = treeheadset.iterator(); while
		 * (num_it.hasNext()) System.out.println(num_it.next());
		 */
		System.out.println("Numbers less than 7: " + numbers.headSet(7));

		// find number equal to or next greater number, or return null if none
		System.out.println("Number equal to or greater than 22: " + numbers.ceiling(22));
		System.out.println("Number equal to or greater than 35: " + numbers.ceiling(35));

		// find number equal to or next less than, or return null if none
		System.out.println("Number equal to or less than 2018: " + numbers.floor(2018));
		System.out.println("Number equal to or less than 5: " + numbers.floor(5));

		// find number that is greater than
		System.out.println("Greater than 27: " + numbers.higher(27));
		System.out.println("Greater than 35: " + numbers.higher(35));

		// find number that is lower than
		System.out.println("Lower than 27: " + numbers.lower(27));
		System.out.println("Lower than 35: " + numbers.lower(35));
		
		System.out.println("Remove first(lowest) number: " + numbers.pollFirst());
		
		System.out.println("Remove last(highest) number: " + numbers.pollLast());
	
		System.out.println("Removes 21 from the TreeList: " + numbers.remove(21));
		

	}

}
