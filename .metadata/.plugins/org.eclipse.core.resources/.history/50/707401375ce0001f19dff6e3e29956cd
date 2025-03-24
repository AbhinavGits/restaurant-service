package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;

public class NumberChecker {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Integer num = 6;
		boolean containsNum = checkIfContainsNumber(numbers,num);
		System.out.println(containsNum);
	}

	private static boolean checkIfContainsNumber(List<Integer> numbers, Integer num) {
		return numbers.stream().anyMatch(n -> n == num);
	}
	
}
