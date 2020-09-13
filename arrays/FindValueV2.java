package main.arrays;

import java.util.Arrays;

public class FindValueV2 {

		public static void main(String[] args) {
			int[] theArray = new int[0];
			// initialise array

			try {
				int result = FindValueV2.min(theArray); // sets result to the result of min()
				System.out.println(result);    //prints first index of array
				

			} catch (ArrayEmptyException aee) {
				System.out.println("ArrayEmptyException: " + aee.getMessage()); 
				//catch ArrayEmptyException and print message
			}

		}

		public static int min(int[] theArray) throws ArrayEmptyException {

			if (theArray.length == 0) {
				throw new ArrayEmptyException("Array must have at least one number.");  
				//if the length of array is 0 , throw the exception to be caught
			}
			
			Arrays.sort(theArray); //sorts array from smallest to largest

			return theArray[0]; // returns smallest number

		}

	}


