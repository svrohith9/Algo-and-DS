package com.leetcode.problems;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(arr));
	}

	public static int findDuplicate(int[] nums) {
		int arr[] = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			int x = arr[nums[i]]++;
			if (x > 0)
				return nums[i];
		}
		return 0;
	}

}
