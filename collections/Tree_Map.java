package main.collections;

import java.util.*;
import java.util.Map.Entry;

public class Tree_Map implements Comparator<String> {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Silver", 4);
		tm.put("Yellow", 3);
		tm.put("Gold", 5);
		tm.put("Blue", 2);
		System.out.println(tm);

		// copy map to another
		Map<String, Integer> copy = new TreeMap<String, Integer>();
		copy.putAll(tm);

		// search for key
		System.out.println("Does the key Silver exist: " + tm.containsKey("Silver"));
		// search for value
		System.out.println("Does the value 5 exist: " + tm.containsValue(5));

		// get all keys
		Set<String> keys = tm.keySet();
		System.out.println(keys);
		for (String key : keys)
			System.out.println(key);

		copy.clear();

		// key-value mapping of greatest and least key in map
		System.out.println("Greatest key: " + tm.firstEntry());
		System.out.println("Least key: " + tm.lastEntry());

		// get greatest and lowest key
		System.out.println("Greatest key: " + tm.firstKey());
		System.out.println("Least key: " + tm.lastKey());

		System.out.println("Reverse order of keys: " + tm.descendingKeySet());

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(40, "Silver");
		map.put(70, "Gold");
		map.put(120, "Crystal");
		map.put(160, "Platinum");
		map.put(10, "Ruby");

		// key-value mapping with the greatest key less than or equal to given key
		System.out.println("Checking floor entry for 40: " + map.floorEntry(40));
		System.out.println("Checking floor entry for 180: " + map.floorEntry(180));

		// greatest key less than or equal to given key
		System.out.println("Checking floor entry for key 80: " + map.floorKey(80));

		// portion of map whose keys are lower
		System.out.println("Portion of map lower than 130: " + map.headMap(130));

		// portion of map whose keys are equal to or lower
		System.out.println("Portion of map equal to or lower than 70: " + map.headMap(70, true));

		// get next higher entry
		System.out.println("Checking entry higher than 5: " + map.higherEntry(5));

		// get next higher key
		System.out.println("Checking key higher than 180: " + map.higherKey(180));

		// get the next lower entry
		System.out.println("Checking entry less than 50: " + map.lowerEntry(50));

		// get the next lower key
		System.out.println("Checking key less than 30: " + map.lowerKey(30));

		// key equal to or next greater key
		System.out.println("Key greater than or equal to 75: " + map.ceilingKey(75));

		// key equal to or next lesser key
		System.out.println("Key less than or equal to 75: " + map.floorKey(75));
		
		// navigable key set
		System.out.println("Navigable set view of keys: " + map.navigableKeySet());

		// get and remove first(lowest) entry
		Entry<String, Integer> first = tm.pollFirstEntry();
		// get and remove last(greatest) entry
		Entry<String, Integer> last = tm.pollLastEntry();

		// get portion of a map whose keys range from given key (inclusive), to another
		// key (exclusive).
		SortedMap<Integer, String> sub_map = new TreeMap<Integer, String>();
		sub_map = map.subMap(30, 70);
		System.out.println("Sub map key values of 30 to 70: " + sub_map);

		// get portion of map whose keys range from given to another (inclusive)
		SortedMap<Integer, String> sub_map2 = new TreeMap<Integer, String>();
		sub_map2 = map.subMap(30, true, 70, true);
		System.out.println("Sub map key-values of 30 to 70 inclusive: " + sub_map2);

		// get portion of map whose keys are greater or equal to given key
		SortedMap<Integer, String> tail_map = new TreeMap<Integer, String>();
		tail_map = map.tailMap(70);
		System.out.println("Tail map of keys 70+: " + tail_map);

		// get portion of map whose keys are greater than given key
		SortedMap<Integer, String> head_map = new TreeMap<Integer, String>();
		sub_map2 = map.headMap(70);
		System.out.println("Sub map key-values greater than 70: " + head_map);

	}

	// sort keys using comparator
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
