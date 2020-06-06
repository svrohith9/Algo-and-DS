package com.leetcode.problems;

/*
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 	            Not 7-1 = 6, as selling price needs to be larger than buying price.
 * Example 2:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class BestTimeBuyAndSellStock1 {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 2 };
		System.out.println(maxProfit(arr));

	}

	public static int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int min = Integer.MAX_VALUE;
		int fin = 0;
		for (int i = 0; i < prices.length; i++) {
			min = Integer.min(min, prices[i]);
			fin = Integer.max(fin, prices[i] - min);
		}
		return fin;
	}

//	right-left strategy does'nt work but quite useful though 
	public static int maxProfit2(int[] prices) {
		if (prices.length < 2)
			return 0;
		if (prices.length == 2)
			return Integer.max(prices[1] - prices[0], 0);
		int sum = 0;
		int left = 0;
		int right = prices.length - 1;
		for (int i = 0; i < prices.length; i++) {
			left = prices[i] < prices[left] && right > i ? i : left;
			right = prices[i] > prices[right] && left < i ? i : right;
			sum = Integer.max(sum, prices[right] - prices[left]);
		}
		return Integer.max(sum, 0);
	}
}
