package com.abhinav.interview.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfMapExtractor {

	public static void main(String[] args) {
		List<Map<String, Integer>> listOfMaps = new ArrayList<>();
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Abhinav", 1);
		map1.put("Aniket", 2);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Abhinav", 3);
		map2.put("Swati", 4);
		
		listOfMaps.add(map1);
		listOfMaps.add(map2);
		
		Set<String> mapKeys = extractListOfMaps(listOfMaps);
		System.out.println(mapKeys);
		
		Set<String> mapKeys1 = extractListOfMapsUsingLambda(listOfMaps);
		System.out.println(mapKeys1);
		}
	
	private static Set<String> extractListOfMapsUsingLambda(List<Map<String, Integer>> listOfMaps) {
		//listOfMaps.stream().flatMap(map -> map.keySet().stream()).collect(Collectors.toSet());
		return listOfMaps.stream().flatMap(map -> map.keySet().stream()).collect(Collectors.toSet());
	}

	private static Set<String> extractListOfMaps (List<Map<String,Integer>> listOfMaps) {
		
		Set<String> keysList = new HashSet<String>();
		for(Map<String, Integer> map : listOfMaps) {
			for (Entry<String, Integer> entry : map.entrySet()) {
				//System.out.println(entry.getKey());
				keysList.add(entry.getKey());
				//System.out.println(entry.getValue());
			}
		}
		 return keysList;
	}

}
