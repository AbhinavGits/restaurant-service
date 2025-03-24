package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfStringToCharacterFrequency {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "grape");
		Map<Character, Long> collect = words.stream().flatMapToInt(s-> s.chars()).mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

}
