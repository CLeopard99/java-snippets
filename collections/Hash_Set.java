package main.collections;

import java.util.*;

public class Hash_Set {

	public static void main(String[] args) {

		HashSet<String> materials = new HashSet<String>();
		materials.add("Steel");
		materials.add("Iron");
		materials.add("Glass");

		/*
		 * for(String s : materials) System.out.println(s);
		 */
		Iterator<String> it = materials.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("Size of HashSet: " + materials.size());

		materials.clear();
		materials.removeAll(materials);

		System.out.println("Is HashSet empty: " + materials.isEmpty());

		materials.add("Cherrywood");
		materials.add("Oak");
		materials.add("Mahogany");

		HashSet<String> clone = new HashSet<String>();
		clone = (HashSet<String>) materials.clone();

		// convert Hash Set to an Array
		String[] array = new String[materials.size()];
		clone.toArray(array);
		for (String element : array) // to print array
			System.out.println(element);

		// Hash Set to Tree Set
		Set<String> treeset = new TreeSet<String>(clone);
		System.out.println("TreeSet: " + treeset);

		// Hash Set to Tree Set
		List<String> arraylist = new ArrayList<String>(clone);
		System.out.println("ArrayList: " + arraylist);

		// print out comparison of two sets
		for (String s : materials)
			System.out.println(clone.contains(s) ? "Yes" : "No");

		// compare two sets and keep elements which are in both sets
		materials.add("Paper");
		System.out.println(materials);
		materials.retainAll(clone);
		System.out.println(materials); // paper gone
		

	}

}
