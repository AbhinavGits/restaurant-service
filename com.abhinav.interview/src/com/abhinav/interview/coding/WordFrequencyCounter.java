package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String str = "ZOOMROOM";
		List<String> listOfWords = Arrays.asList("apple banana apple", "banana cherry", "apple banana cherry");
		Map<String, Long> frequencyMap = countWordFrequency(listOfWords);
		System.out.println(frequencyMap);
		Map<Character, Long> characterFrequencyMap = countWordFrequencyForString(str);
		System.out.println(characterFrequencyMap);
	}

	private static Map<String, Long> countWordFrequency(List<String> listOfWords) {
		return listOfWords.stream().flatMap(line -> Arrays.asList(line.split(" ")).stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	private static Map<Character, Long> countWordFrequencyForString(String str){
		return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

}
