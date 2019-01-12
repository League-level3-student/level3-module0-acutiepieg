package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {

	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = { "a", "b", "c", "d", "e" };

		// 2. print the third element in the array
		System.out.println(array[2]);
		// 3. set the third element to a different value
		array[3] = "changed";
		// 4. print the third element again
		System.out.println(array[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "hi";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 7. make an array of 50 integers
		int[] numbers = new int[50];
		for (int i = 0; i < 50; i++) {
			numbers[i] = i;
		}
		// 8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			int ran = r.nextInt(501);
			numbers[i] = ran;
		}
		java.util.Arrays.sort(numbers);
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = 501;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println(smallest);
		
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// 11. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		java.util.Arrays.sort(numbers);
		System.out.println(largest);
		//or, because of command above
		System.out.println(numbers[numbers.length-1]);
		// 12. print only the last element in the array
		int lastElement = numbers.length - 1;
		System.out.println(numbers[lastElement]);
	}
}
