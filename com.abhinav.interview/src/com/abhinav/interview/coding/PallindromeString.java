package com.abhinav.interview.coding;

public class PallindromeString {
	
	public static void main(String[] args) {
		String str = "a";
		boolean isPallindrome = isPallindrome(str,"Using 2 pointers");
		System.out.println(isPallindrome);
	}

	private static boolean isPallindrome(String str) {
		str = str.replace(" ","").toLowerCase();
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	private static boolean isPallindrome(String str, String msg) {
		str = str.replace(" ","").toLowerCase();
		System.out.println(msg);
		int left; int right;
		left = 0;
		right = str.length()-1;
		
		while (left<right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

}
