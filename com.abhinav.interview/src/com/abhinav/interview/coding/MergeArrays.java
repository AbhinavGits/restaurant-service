package com.abhinav.interview.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = {3, 6, 8, 10, 10};
        int[] arr2 = {1, 2, 4, 5};
        
        int[] mergedArrays = mergeAndSortArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArrays));
	}

	private static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
	}
}
