package assignments;

import java.util.Arrays;

public class _227_OO_18TableGenerator2 {
	public static void main(String[] args) {
		PrimeNumbersTable p = new PrimeNumbersTable();
		System.out.println(p.isPrime(2));// true

		System.out.println(Arrays.toString(p.generateTable(100, 5)));// [101, 103, 107, 109, 113]
		 System.out.println(p.checkTable(5, new int[]{5, 7, 11}));//false
		 System.out.println();

	}

}

/**
 * When we say Prime, that meaning can be used in different ways, thus it is an
 * interface, part of abstraction in Java. There is multiple ways if some number
 * is prime, so any class that implements Primes will provide implementation for
 * the isPrime abstract method
 */
interface Primes {

	public abstract boolean isPrime(int n);
}

/**
 * this is an interface TableGenerator with 2 abstract methods.
 *
 * Any class that implements this interface CAN-DO 1. generate table in any way.
 * and 2. check table in any way.
 *
 * We do not currently know currently know, how and what kind of table should be
 * generated, and we do not even know how to check it. Since it is all ABSTRACT.
 * We know the functionality is there but implementation is hidden/not here.
 */
interface TableGeneratorr {

	public abstract int[] generateTable(int value, int numberOfEntries);

	public abstract boolean checkTable(int value, int[] tableToTest);
}

class PrimeNumbersTable implements TableGeneratorr, Primes {

	/**
	 *
	 * Override isPrime method
	 * 
	 * @param number
	 * @return true if number is prime , false if it is not
	 */

	@Override
	public boolean isPrime(int number) {

		// TODO:
		int count = 0;
		for (int i = 1; i <= number; i++) {

			if (number >= 2 && number % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	/**
	 * Override the abstract method from TableGenerator interface.
	 *
	 * @param start           - start prime numbers sequence from this int
	 * @param numberOfEntries - how many prime numbers need to be in returning int[]
	 *                        array
	 * @return int[] array with prime numbers
	 *
	 *         Note: Call isPrime method while looking for prime numbers to fill up
	 *         sequence array.
	 *
	 *         Examples: generateTable(1, 3); => [2, 3, 5] first 3 prime numbers
	 *         starting from 1 is 2,3,5 1 itself is not prime so it is not in the
	 *         array.
	 *
	 *         generateTable(5, 3); => [5, 7, 11] first 3 prime numbers starting
	 *         from 5 is 5,7,11 * 5 itself is prime so it is in the array.
	 *
	 *         generateTable(100, 5); => [101, 103, 107, 109, 113] first 5 prime
	 *         numbers starting from 100. 100 itself is not prime so it is not in
	 *         the array.
	 * 
	 */
	@Override
	public int[] generateTable(int start, int numberOfEntries) {
		// TODO

		int[] table = new int[numberOfEntries];

		int i = start;
		int idx = 0;
		do {
			if (isPrime(i)) {
				table[idx] = i;
				idx++;
			}
			i++;
		} while (idx < numberOfEntries);

		return table;
	}

	/**
	 * Override checkTable method.
	 *
	 * Method checks if the array int[] tableToTest contains correct sequence of
	 * prime numbers that starts from int start
	 *
	 * @param start       - sequence of prime numbers start from this int
	 * @param tableToTest - test the sequence if it is in right order.
	 * @return true if 1) all numbers are prime AND 2) numbers are in asc order AND
	 *         3) the sequence starts from start variable value return false if any
	 *         of above conditions is false Examples:
	 *
	 *         int[] p = {101, 103, 107, 109, 113}; checkTable(100, p); => true
	 *
	 *         int[] p = {2, 3, 5}; checkTable(1, p); => true
	 *
	 *         int[] p = {2, 3, 4, 5}; checkTable(1, p); => false because 4 is not
	 *         prime
	 *
	 *         int[] p = {2, 3, 5}; checkTable(5, p); => false because sequence is
	 *         not starting from 5
	 *
	 */

	@Override
	public boolean checkTable(int start, int[] tableToTest) {
		// TODO:

	       int[] newTable = generateTable(start, tableToTest.length);
	       return Arrays.equals(tableToTest, newTable);
	}

}
