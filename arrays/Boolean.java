package main.arrays;

public class Boolean {
	
	public static boolean duplicates(int[] array, int min, int max) {
		
		boolean[] found = new boolean[max-min + 1];
		for(int i = 0; i < found.length; i ++) {
			found[i] = false; // fill boolean array with false
		}
		
		for(int j = 0; j < array.length; j++) {
			int i = array[j] - min;
			if (found[i]) {
				return true;
			}
			found[i] = true;
		}
		return false;
	}

}
