package com.algorithms.graphs;

import java.util.Scanner;

public class FindNumberOfIslands {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int mat[][] = new int[rows][columns];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println(dfsConnections(mat));
		sc.close();
	}

	private static int dfsConnections(int[][] mat) {
		int count = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					count++;
					dfsIslands(mat, i, j);
				}
			}
		}
		return count;
	}

	private static void dfsIslands(int[][] mat, int i, int j) {
		if (i < 0 || j < 0 || i >= mat.length || j >= mat[i].length)
			return;
		if (mat[i][j] == 0)
			return;

		mat[i][j] = 0;

		for (int x = i - 1; x <= i + 1; x++) {
			for (int y = j - 1; y <= j + 1; y++) {
//				if (i != x && j != y)    							cross directional check
				dfsIslands(mat, x, y);
			}
		}
		return;
	}

//	 1 1 0 0 0
//	 0 1 0 0 1
//	 1 0 0 1 1
//	 0 0 0 0 0
//	 1 0 1 0 1

// output: 5

}
