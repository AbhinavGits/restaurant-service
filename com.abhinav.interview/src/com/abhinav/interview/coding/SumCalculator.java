package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.List;

public class SumCalculator {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	Integer sumOfNumbers = calculateSum(numbers);
	System.out.println(sumOfNumbers);
}
public static Integer calculateSum(List<Integer> nums) {
	//return nums.stream().reduce(0, ((a,b) -> a+b));
	return nums.stream().reduce(0, Integer::sum);
}
}
