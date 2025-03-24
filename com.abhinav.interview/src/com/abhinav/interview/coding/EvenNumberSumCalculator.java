package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSumCalculator {

	private static int sumOfEvenNumbers(List<Integer> numbers) {
		return numbers.stream().filter(n -> n% 2==0).mapToInt(n -> n).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int evenSum = sumOfEvenNumbers(numbers);
		System.out.println(evenSum);
	}

}
