package com.leetcode.problems;

import java.util.Arrays;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 */

public class SingleNumber {
	public static void main(String[] args) {
	}

	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int cur = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (cur == nums[i]) {
				i++;
				cur = nums[i];
			} else
				break;
		}
		return cur;
	}
}
