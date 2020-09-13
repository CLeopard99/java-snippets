package main.arrays;

public class Duplicates {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 4 };
		System.out.println(duplicates(array));
	}

	// to check for duplicates length * (length - 1) / 2
	public static boolean duplicates(int[] array) {

		for (int i = 0; i < array.length - 1; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j])
					return true;

		return false;
	}

	// if the array is sorted, then duplicate values will be adjacent so only the
	// next value needs to be compared
	public static boolean sortedDuplicates(int[] array) {

		for (int i = 1; i < array.length; i++)
			if (array[i] == array[i - 1])
				return true;

		return false;
	}

}
