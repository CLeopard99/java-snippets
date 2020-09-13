package main.collections;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {

		LinkedList<String> materials = new LinkedList<String>();
		materials.add("Oak");
		materials.add("Stone");
		materials.add("Glass");
		System.out.println(materials);

		for (String s : materials)
			System.out.println(s);

		// iterate from specified index
		Iterator<String> i = materials.listIterator(2);
		while (i.hasNext())
			System.out.println(i.next());

		// reverse iterator
		Iterator<String> ri = materials.descendingIterator();
		while (ri.hasNext())
			System.out.println(ri.next());

		materials.add(1, "Brick"); // insert at specified index
		System.out.println(materials);

		materials.addFirst("Steel");
		materials.addLast("Mahogany");
		System.out.println(materials);

		materials.offerFirst("Jade");
		materials.offerLast("Cherrywood");
		System.out.println(materials);

		// add some elements at specified index
		LinkedList<String> listtwo = new LinkedList<String>();
		listtwo.add("Twine");
		listtwo.add("Crystal");
		listtwo.add("Marble");
		materials.addAll(1, listtwo);

		System.out.println("First material: " + materials.getFirst());
		System.out.println("Last material: " + materials.getLast());

		for (int j = 0; j < materials.size(); j++) {
			System.out.println("Index " + j + ": " + materials.get(j));
		}

		listtwo.remove(1);
		listtwo.removeFirst();
		listtwo.removeLast();

		Collections.swap(materials, 4, 5);

		Collections.shuffle(materials);

		LinkedList<String> clone = (LinkedList<String>) materials.clone();
		System.out.println(clone);

		// pop removes first element, push adds new first element
		System.out.println("Removed element: " + materials.pop());

		System.out.println("First element in the list: " + materials.peekFirst());
		System.out.println("Last element in the list: " + materials.peekLast());

		if (materials.contains("Oak"))
			System.out.println("Found the element");
		else {
			System.out.println("There is no such element");
		}

		System.out.println(materials.isEmpty());

		LinkedList<String> compare = new LinkedList<String>();
		for (String s : materials)
			compare.add(clone.contains(s) ? "Yes" : "No");
		System.out.println(compare);

		materials.set(1, "Iron"); // replace element

		// to convert from linked list to array list
		List<String> list = new ArrayList<String>(materials);
		System.out.println("Array list: " + list);

		materials.clear();
		materials.removeAll(materials);

	}
}
