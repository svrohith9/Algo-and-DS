package com.leetcode.problems;

/*
 * Example 1:
 * n = 5
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * 
 * Because the 3rd row is incomplete, we return 2.
 * 
 * Example 2:
 * n = 8
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * 
 * Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
	}

	public static int arrangeCoins(int n) {
		int res = 0;
		for (int i = 1;; i = i++ + 1) {
			if (n >= i) {
				n = n - i;
				res++;
			} else
				break;
		}
		return res;
	}

}
