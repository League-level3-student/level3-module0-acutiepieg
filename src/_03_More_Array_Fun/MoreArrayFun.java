package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {

	static String[] array = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" };

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printArray(array);
		printArrayBackwards(array);
		everyOther(array);
		random(array);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printArrayBackwards(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOther(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				System.out.println(array[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void random(String[] array) {
		Random ran = new Random();
		for(int i = 0; i < 50; i ++) {
			int r1 = ran.nextInt(array.length);
			int r2 = ran.nextInt(array.length);
			String holder = array[r1];
			array[r1] = array[r2];
			array[r2] = holder;	
		}
		printArray(array);
	}
}
