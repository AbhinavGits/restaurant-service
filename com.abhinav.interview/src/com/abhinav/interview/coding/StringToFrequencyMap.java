package com.abhinav.interview.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToFrequencyMap {

	public static void main(String[] args) {
		String str1 = "Silent is awesome";
		String str2 = "Listen is someawe";
		 Map<Character, Long> charCountMap1 = str1.replace(" ","").toLowerCase().chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		 Long maxFrequency = Collections.max(charCountMap1.values());
		 List<Character> mostFrequentChar = new ArrayList<Character>();
		 for (Entry<Character, Long> entry:charCountMap1.entrySet()) {
			 if(entry.getValue()==maxFrequency) {
				 mostFrequentChar.add(entry.getKey());
			 }
		 }
		 System.out.println("Most Frequent Char = "+mostFrequentChar + " "+"Count:"+maxFrequency);
		 
	}
}
