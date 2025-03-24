package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterCounter {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple","banana", "orange", "grape", "kiwi");
		char targetChar = 'a';
		long occurences = countCharacterOccurences(strings,targetChar);
		System.out.println(occurences);
	}

	private static long countCharacterOccurences(List<String> strings, char targetChar) {
		//strings.stream().flatMapToInt(CharSequence::chars).forEach(System.out::println);
		return strings.stream().flatMapToInt(CharSequence::chars).filter(ch -> ch == targetChar).count();
	}

}
