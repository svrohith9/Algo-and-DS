package com.algorithms.graphs;

import java.util.Scanner;



/**
 * @author svrohith9
 * @category DFS algorithms
 * 
 * LONGEST CONNECTED CHAIN
 * 
 * 	 1 1 0 0 0
	 0 1 0 0 1
	 1 0 0 1 1
	 0 0 0 0 0
	 1 0 1 0 1
 * 
 *  output: 3
 * 
 */
public class AllConnectedNodes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		int[][] arr = new int[x][y];
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}

//		System.out.println(getLongestChain(arr));

	}

	public static int getLongestChain(int arr[][]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					int ans = countConnected(arr, i, j);
					max = Integer.max(max, ans);
//					System.out.println(max);
				}
			}
		}
		return max;
	}

	private static int countConnected(int[][] arr, int i, int j) {
		if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length)
			return 0;
		if (arr[i][j] == 0)
			return 0;
		arr[i][j] = 0;
		int count = 1;
		for (int x = i - 1; x <= i + 1; x++) {
			for (int y = j - 1; y <= j + 1; y++) {
				if (x != i || y != j)
					count += countConnected(arr, x, y);
				// System.out.println(count);
			}
		}
		return count;
	}

}
