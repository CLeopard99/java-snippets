package main.arrays;


public class FindValue {

	public static void main(String[] args) {              
		 int[] theArray = {9, 23, 107, 92, 11, 4};     // initialise array    
		
		 try {
		 int result = FindValue.min(theArray);  
		 System.out.println(result);
		 
		} catch (ArrayEmptyException aee) {
			 System.out.println("ArrayEmptyException: " + aee.getMessage());
		 }
		 
	 }

	public static int min(int[] arr) throws ArrayEmptyException {

		if (arr.length == 0) {
			throw new ArrayEmptyException("Array must have at least one number.");  
			//if the length of array is 0 , throw the exception to be caught
		}
		
		int n = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					n = arr[j];
				}
			}
		}
		return n;

	}

}
