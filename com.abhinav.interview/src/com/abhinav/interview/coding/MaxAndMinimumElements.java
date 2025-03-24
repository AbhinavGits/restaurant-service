package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinimumElements {

	public static void main(String[] args) {
		 	List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25, 3, 30, 1, 8);

	        List<Integer> maxNumbers = findMaxNumbers(numbers, 3);
	        List<Integer> minNumbers = findMinNumbers(numbers, 3);
	        
	        System.out.println(maxNumbers);
	        System.out.println(minNumbers);
	}

	private static List<Integer> findMinNumbers(List<Integer> numbers, int i) {
		return numbers.stream().sorted().limit(i).collect(Collectors.toList());
	}

	private static List<Integer> findMaxNumbers(List<Integer> numbers, int i) {
		return numbers.stream().sorted(Comparator.reverseOrder()).limit(i).collect(Collectors.toList());
	}

}
