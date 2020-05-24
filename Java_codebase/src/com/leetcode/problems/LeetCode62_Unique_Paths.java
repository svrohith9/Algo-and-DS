package com.leetcode.problems;

public class LeetCode62_Unique_Paths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 2));
	}

	public static int uniquePaths(int m, int n) {
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			arr[i][0] = 1;
		for (int i = 0; i < n; i++)
			arr[0][i] = 1;
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		return arr[m - 1][n - 1];
	}
}

//debug

//0 0		 1 1 	  1 1	   1 1
//0 0	---> 1 0 ---> 1 2 ---> 1 2 
//0 0		 1 0	  1 0 	   1 3

