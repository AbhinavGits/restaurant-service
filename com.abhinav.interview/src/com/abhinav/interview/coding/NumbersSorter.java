package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersSorter {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(5,4,2,7,8,1,3,4);
		
		List<Integer> sortedList = sortNumbers(listOfIntegers);
		System.out.println(sortedList);
	}

	private static List<Integer> sortNumbers(List<Integer> listOfIntegers) {
		return listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}
