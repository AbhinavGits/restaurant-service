package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSorter {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,3,4,5,2,3,4,5,1);
		List<Integer> collect = integers.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
