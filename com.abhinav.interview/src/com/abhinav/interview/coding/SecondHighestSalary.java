package com.abhinav.interview.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SecondHighestSalary {

	public static void main(String[] args) {
		 Map<String, Integer> employees = new HashMap<>();
	        employees.put("Alice", 50000);
	        employees.put("Bob", 60000);
	        employees.put("Charlie", 70000);
	        employees.put("David", 90000);
	        employees.put("Eva", 80000);
	        employees.put("Eve", 80000);
	     
	        List<Entry<String, Integer>> result = employees.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).skip(1).limit(1).collect(Collectors.toList());
	        Entry<String, Integer> entry = result.get(0);
	        System.out.println(entry);
	        System.out.println("Employee name: "+entry.getKey()+ " "+"Salary:"+entry.getValue());
	}

}
