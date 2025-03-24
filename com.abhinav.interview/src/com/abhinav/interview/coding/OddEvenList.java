package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class OddEvenList {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(10,20,30,40,50,55,67,23,22);
		
		Map<Boolean, List<Integer>> oddEvenMap = oddEvenMap(listOfIntegers);
		System.out.println(oddEvenMap);
		System.out.println(oddEvenMap.get(true));
		System.out.println(oddEvenMap.get(false));
		Map<String, List <Integer>> evenOddOutput = new HashMap<String, List<Integer>>();
		evenOddOutput.put("Even", oddEvenMap.get(true));
		evenOddOutput.put("Odd", oddEvenMap.get(false));
		
		for (Entry<String, List<Integer>> entry : evenOddOutput.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	
	}
	private static Map<Boolean, List<Integer>> oddEvenMap(List<Integer> listOfIntegers) {
		return listOfIntegers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0 ));
	}

}
