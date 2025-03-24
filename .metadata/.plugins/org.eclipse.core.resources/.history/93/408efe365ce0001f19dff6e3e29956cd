package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageStringLengthCalculator {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple","banana", "orange", "grape", "kiwi");
		List<Integer> averageLength = calculateAvgStringLength(strings);
		System.out.println(averageLength);
	}

	private static List<Integer> calculateAvgStringLength(List<String> strings) {
		//return strings.stream().mapToInt(String::length).average().orElse(0.0);
		return strings.stream().map(String::length).collect(Collectors.toList());
	}
	
}
