package com.bookProject.bookChapter5;

import java.util.Scanner;
import java.util.ArrayList;

public class BreakContinue {

	public static void main(String[] args) {
		// find the number of integers above the average of the input positive integers.
		// the input terminates with a sentinel value of zero
		final int SENTINEL = 0;
		System.out.println(nAboveAverage(SENTINEL));

		// sum all integers from 1 to END but discard those which are multiples of 7
		final int END = 100;
		System.out.println("1+2+3+4+5+6+8+9+...+END = " + sumWithoutMultiplesOf7(END));

	}

	public static int nAboveAverage(int sentinel) {
		int numberOfValues = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int value = input.nextInt();
			if (value != sentinel) {
				numberOfValues++;
				list.add(value);
			} else
				break;
		}
		input.close();
		if (numberOfValues == 0)
			return -1; // no valid input data
		else {
			double sum = 0.0;
			for (Integer i : list)
				sum += i;
			double average = sum / numberOfValues;
			int count = 0;
			for (int n : list)
				if (n > average)
					count++;
			return count;
		}
	}

	public static int sumWithoutMultiplesOf7(int upto) {
		int sum = 0;
		for (int i = 1; i <= upto; i++) {
			if (i % 7 == 0)
				continue;
			sum += i;
		}
		return sum;
	}
}

//1 2 3 4 5 0
//2
//1+2+3+4+5+6+8+9+...+100 = 4315
