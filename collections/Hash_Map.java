package main.collections;
import java.util.*;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Red", 1);
		m.put("Blue", 2);
		m.put("Silver", 4);
		m.put("Yellow", 3);
		System.out.println(m);
		
		for( Map.Entry x : m.entrySet())
			System.out.println(x.getKey() + " " + x.getValue());
		
		System.out.println("Number of key-value mappings: " + m.size());
		
		HashMap<String, Integer> mtwo = new HashMap<String, Integer>();
		mtwo.putAll(m);
		
		mtwo.clear();
		
		System.out.println("Is Hash Map empty: " + mtwo.isEmpty());
		
		// create clone map
		mtwo =  (HashMap<String, Integer>) m.clone();
		System.out.println(mtwo);
		
		// check for key
		System.out.println("Does the key Red exist? ");
		if (m.containsKey("Red"))
				System.out.println("Yes - " + m.get("Red"));
		else {
			System.out.println("No");
		}
		
		// check for value
		System.out.println("Does the value 4 exist? ");
		if(m.containsValue(4)) 
			System.out.println("Yes");
		else {
			System.out.println("No");
		}
		
		// print set of values and keys
		Set<?> set = m.entrySet();
		System.out.println("Set values: " + set);
		
		// print set of keys
		Set<?> keyset = m.keySet();
		System.out.println("Key set: " + keyset);
		
		// print set of values
		System.out.println("Value set: " + m.values());
		
		// get value for key
		int value = m.get("Silver");
		System.out.println("Value for key Silver is: " + value);
				
		
		
		
		
		
		
		
	}

}
