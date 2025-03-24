package com.abhinav.interview.coding;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayAverageCalculator {

	public static void main(String[] args) {
		int[] arr = {1,5,10,15,12,4,6,11};
		List<Integer> listOfIntegers = IntStream.of(arr).boxed().collect(Collectors.toList());
//		for (int i=0;i<arr.length;i++) {
//			listOfIntegers.add(arr[i]);
//		}
		OptionalDouble avg = listOfIntegers.stream().mapToInt(num -> num*num).filter(n -> n>100).average();
		System.out.println(avg.getAsDouble());
	}
}
