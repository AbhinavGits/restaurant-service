package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class EvenNumberAverageCalculator {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,11);
		double evenNumberAverage = calculateEvenNumberAverage(numbers);
		System.out.println(evenNumberAverage);
	}

	private static double calculateEvenNumberAverage(List<Integer> numbers) {
		OptionalDouble avg = numbers.stream().filter(n -> n%2 ==0).mapToInt(n->n).average();
		return avg.orElse(0.0);
	}

}
