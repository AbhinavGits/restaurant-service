package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommaSeperatedStringConvertor {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		String commaSeperatedString = convertListToCommaSeparatedString(numbers);
		Optional<Integer> lastInteger = lastElementOfList(numbers);
		System.out.println(commaSeperatedString);
		System.out.println(lastInteger.get());
	}

	private static Optional<Integer> lastElementOfList(List<Integer> numbers) {
		return numbers.stream().reduce((a,b) -> b);
	}

	private static String convertListToCommaSeparatedString(List<Integer> numbers) {
		return numbers.stream().map(o -> o.toString()).collect(Collectors.joining(","));
	}

}
