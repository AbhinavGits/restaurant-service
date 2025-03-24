package com.abhinav.interview.coding;

import java.util.Arrays;

public class Anagrams {

	public static void main(String args[]) {
		String s1 = "silent is awesome";
		String s2 = "listen is someawe";
		boolean isAnagram = isAnagram(s1,s2);
		System.out.println(isAnagram);
	}

	private static boolean isAnagram(String s1, String s2) {
		
		 s1 = s1.replace(" ", "").toLowerCase();
		 s2 = s2.replace(" ", "").toLowerCase();
		
		if(s1.length() != s2.length())
		return false;
		
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
}
