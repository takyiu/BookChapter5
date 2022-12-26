package com.bookProject.bookChapter5;

import java.util.Arrays; 
import java.util.List;
import java.util.stream.IntStream; // only needed for streams

/*
 * For Example
 * Simple array
 * Enhanced for loop
 * Simple array stream processing
 * ArrayList object
 * ArrayList iterator
 * ArrayList stream processing
 */

public class ForExample {
	public static void main(String[] args) {
		int[] data = { 100, 200, 300, 400, 500 };
		for (int i = 0; i < data.length; ++i)
			System.out.printf("Square Root of %4d is %4.2f.\n", data[i], Math.sqrt(data[i]));
		System.out.println();
		for (int n : data)
			System.out.printf("Square Root of %4d is %4.2f.\n", n, Math.sqrt(n));
		System.out.println();
		IntStream.of(data).forEach(n -> System.out.printf("Square Root of %4d is %4.2f.\n", n, Math.sqrt(n)));
		System.out.println();
	
		List<Integer> list = Arrays.asList(new Integer[] { 100, 200, 300, 400, 500 });
		for (int i = 0; i < list.size(); ++i)
			System.out.printf("Square Root of %4d is %4.2f.\n", list.get(i), Math.sqrt(list.get(i)));
		System.out.println();
		for (int n : list)
			System.out.printf("Square Root of %4d is %4.2f.\n", n, Math.sqrt(n));
		System.out.println();
		list.stream().forEach(n -> System.out.printf("Square Root of %4d is %4.2f.\n", n, Math.sqrt(n)));
		System.out.println(); 
	}
}

/*Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

Square Root of  100 is 10.00.
Square Root of  200 is 14.14.
Square Root of  300 is 17.32.
Square Root of  400 is 20.00.
Square Root of  500 is 22.36.

*/
