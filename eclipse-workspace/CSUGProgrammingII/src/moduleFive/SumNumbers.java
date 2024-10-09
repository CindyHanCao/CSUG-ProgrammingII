/**
 * 
 */
package moduleFive;

import java.util.Scanner;

/**
 * 
 */
public class SumNumbers {

	/**
	 * @author Cindy Cao
	 * methods: sumNumbers, with parameters an array of numbers, and the index of the number
	 * Purpose: to calculate sum of five numbers using recursive method
	 */
	public static int sumNumbers(int[] numbers, int index) {
		
		// base case: when the index reaches the last number, we return the number itself.
		if (index == numbers.length - 1) {
			return numbers[index];
		}
		
		// recursive case: add current number to the rest of numbers' sum
		return numbers[index] + sumNumbers(numbers, index + 1);
	}
	public static void main(String[] args) {
		// create Scanner object to read input from users
		Scanner scan = new Scanner(System.in);
		
		// array to store the five numbers
		int[] numbers = new int[5];
		
		// User start to enter numbers, in this case, numbers need to be separated by comma on the same line
		System.out.println("Please enter the five numbers to sum (using comma to separate numbers in one line) : ");
		String input = scan.nextLine();
		
		// split the numbers by comma
		String[] parts = input.split(",");
		
		// iterate the numbers and convert from string to integer and add it to the array, which is size of 5 that we set on line 33
		for (int i = 0; i < 5; i++ ) {
			numbers[i] = Integer.parseInt(parts[i]);
		}
		
		// call method to calculate, start with index 0's number
		int result = sumNumbers(numbers, 0);
		
		System.out.println("The sum of the five numbers is : " + result);
		
		scan.close();

	}

}
