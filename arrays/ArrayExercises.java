package main.arrays;

import java.util.*;

public class ArrayExercises {

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 4, 6, 5, 8, 7, 9, 10 };
		String[] strings = { "Orange", "Melon", "Apple", "Banana", "Fig", "Pear" };

		// sort arrays
		Arrays.sort(nums);
		Arrays.sort(strings);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(strings));

		// find sum of int array
		int sum = 0;
		for (int i : nums)
			sum += i;
		System.out.println("Total sum of array: " + sum);

		// print out 10x10 grid
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				System.out.printf("%2d ", a[i][j]);

			System.out.println();
		}

		// find average of array
		int average = 0;
		for (int i : nums)
			average += i;
		average = average / nums.length;
		System.out.println("Average value of array is: " + average);

		System.out.print("Does the array contain 11: " + contains(nums, 11));

		// to find index of element
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 8)
				System.out.println("The index of 8 is : " + i);
		}

		// removes specified index but duplicates last two indexes
		int removeIndex = 2;
		for (int i = removeIndex; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}

		// copy an array to another
		String[] copy = new String[6];
		for (int i = 0; i < strings.length; i++) {
			copy[i] = strings[i];
		}
		System.out.println(Arrays.toString(copy));
		
		// insert element at specified index, but deletes last element
		int index = 3;
		for(int i = strings.length - 1; i > index; i--) 
			strings[i] = strings[i-1];
		strings[index] = "Kiwi"; 
		System.out.println(Arrays.toString(strings));

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] array = new String[n];
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			array[i] = s;
		}
		scan.close();

		// Prints each sequential element in array a
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

	// check if array contains given element
	public static boolean contains(int[] arr, int element) {
		for (int i : arr) {
			if (element == i)
				return true;
		}
		return false;
	}
}
