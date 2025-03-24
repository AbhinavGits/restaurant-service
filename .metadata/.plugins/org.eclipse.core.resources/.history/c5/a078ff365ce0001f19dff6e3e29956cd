package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;

public class DigitSumCounter {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(123, 456, 789);
		int digitSum = calculateDigitSum(numbers);
		System.out.println(digitSum);
	}

	private static int calculateDigitSum(List<Integer> numbers) {
		return numbers.stream()
				.mapToInt(n -> sumDigits(n)).sum();
	}
	
	public static int sumDigits (int number) {
		return String.valueOf(number).chars().map(Character::getNumericValue).sum();
	}

}

// method converts the number to a string, 
//then uses chars() to process each character(digit)
// converts each character to its 
//numeric value using Character::getNumericValue, and sums them up.