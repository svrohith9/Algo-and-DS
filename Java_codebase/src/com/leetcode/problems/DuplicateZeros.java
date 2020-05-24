package com.leetcode.problems;

/*
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * 
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * 
*/

public class DuplicateZeros {
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
		duplicateZeros(arr);

	}

	public static void duplicateZeros(int[] arr) {
		int brr[] = new int[2 * arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				brr[j++] = arr[i];
			} else {
				brr[j++] = 0;
				brr[j++] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++)
			arr[i] = brr[i];
	}

}
