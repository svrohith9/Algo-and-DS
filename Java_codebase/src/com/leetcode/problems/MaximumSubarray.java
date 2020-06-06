package com.leetcode.problems;

/*
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 */

public class MaximumSubarray {
	public static void main(String[] args) {
		int nums[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int finSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum = Integer.max(nums[i], nums[i] + sum);
			finSum = Integer.max(sum, finSum);
		}
		return finSum;
	}

}
