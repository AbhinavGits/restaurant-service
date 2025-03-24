package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilter {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> evenNumbers = filterEvenNumbersList(numbers);
		System.out.println(evenNumbers);
	}	
	
	public static List<Integer> filterEvenNumbersList (List<Integer> numbers){
		return numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
	}
}
