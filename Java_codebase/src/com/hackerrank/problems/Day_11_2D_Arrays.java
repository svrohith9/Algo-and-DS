package com.hackerrank.problems;

import java.util.Scanner;

public class Day_11_2D_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int sum = Integer.MIN_VALUE;
		int temp = -1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];

				if (sum < temp) {
					sum = temp;
				}
			}
		}
		System.out.println(sum);
	}

}
