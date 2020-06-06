package com.leetcode.problems;

import java.util.Arrays;

/*
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

public class MoveZeroes {

	public static void main(String[] args) {
		int nums[] = new int[] { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
	}

	public static void moveZeroes(int[] nums) {
		int cur = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				nums[cur++] = nums[i];
		Arrays.fill(nums, cur, nums.length, 0);
		Arrays.stream(nums).forEach(mapper -> {
			System.out.println(mapper);
		});
	}
}
