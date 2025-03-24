package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcetanator {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Hello"," ","World","!");
		String concetanatedString = concetanateStrings (strings);
		System.out.println(concetanatedString);
	}

	private static String concetanateStrings(List<String> strings) {
		return strings.stream().collect(Collectors.joining());
	}

}
