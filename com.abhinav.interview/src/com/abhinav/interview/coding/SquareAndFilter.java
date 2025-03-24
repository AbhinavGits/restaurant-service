package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndFilter {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(10,20,30,40,50,55,67,23,22);
		List<Integer> squaresEligible = squaresAndFilter(listOfIntegers);
		System.out.println(squaresEligible);
	}

	private static List<Integer> squaresAndFilter(List<Integer> listOfIntegers) {
		return listOfIntegers.stream()
				.map(n -> n * n)
				.filter(a -> a<1000)
				.collect(Collectors.toList());
	}
}
