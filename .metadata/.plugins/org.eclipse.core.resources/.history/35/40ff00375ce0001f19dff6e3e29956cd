package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringFinder {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		List<String> longestString = findLongestString(strings);
		System.out.println(longestString);
	}

	private static List<String> findLongestString(List<String> strings) {
		final int maxLength = strings.stream().mapToInt(String::length).max().orElse(0);
		return strings.stream().filter(s -> s.length() == maxLength).collect(Collectors.toList());
	}

}
