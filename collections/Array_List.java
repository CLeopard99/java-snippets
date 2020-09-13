package main.collections;

import java.util.*;

public class Array_List {
	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		al.add("red");
		al.add("blue");
		al.add("purple");
		al.add("green");
		System.out.println(al);

		ListIterator<String> iterator = al.listIterator();
		while (iterator.hasNext()) {
			String colour = iterator.next();
			System.out.println(colour);
			// or for(String colour : al)
		}

		al.add(0, "gray"); // inserted at first position

		int index = 0;
		String colour = al.get(index);
		System.out.println("First element: " + colour);

		al.set(1, "orange"); // replace red with orange

		al.remove(4);
		System.out.println(al);

		if (al.contains("orange"))
			System.out.println("Found the element");
		else {
			System.out.println("There is no such element");
		}

		Collections.sort(al);
		System.out.println(al);

		List<String> al2 = new ArrayList<>();
		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add("4");
		Collections.copy(al, al2); // (destination, source)
		System.out.println(al2);

		Collections.reverse(al);
		System.out.println(al);

		Collections.shuffle(al);
		System.out.println(al);

		List<String> sub_list = al.subList(0, 3);
		System.out.println(sub_list);

		// Storing comparison output of two list in another array list
		List<String> al3 = new ArrayList<>();
		for (String s : al)
			al3.add(al2.contains(s) ? "Yes" : "No");
		System.out.println(al3);

		ArrayList<String> materials = new ArrayList<>();
		materials.add("Wood");
		materials.add("Brick");
		materials.add("Steel");
		materials.add("Glass");
		Collections.swap(materials, 0, 2);
		System.out.println(materials);

		al.addAll(materials);

		ArrayList<String> clone = (ArrayList<String>) materials.clone();
		System.out.println(clone);

		clone.removeAll(clone); // empty an array list
		clone.clear();

		System.out.println("Is the Array List empty?: " + clone.isEmpty());

		materials.trimToSize(); // makes array list same size as number of elements

		materials.ensureCapacity(8);

		String stone = "Stone";
		materials.set(1, stone);

		for (int i = 0; i < materials.size(); i++)
			System.out.println(materials.get(i));

	}

}
