package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumberFinder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,1,1);
		Integer maxNumber = getMaxElementFromList(numbers);
		System.out.println(maxNumber);
	}

	private static Integer getMaxElementFromList(List<Integer> numbers) {
		 return numbers.stream().max((c,c1) -> c.compareTo(c1)).orElse(Integer.MIN_VALUE);

	}

}
