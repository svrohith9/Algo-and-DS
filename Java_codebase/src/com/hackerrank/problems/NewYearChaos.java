package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewYearChaos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4));
		minimumBribes(al);
		sc.close();
	}

	public static void minimumBribes(List<Integer> q) {
		int cr = 0;
		boolean isDone = false;
		int[] arr = q.stream().mapToInt(i -> i).toArray();

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] - (i + 1)) > 2) {
				isDone = true;
				break;
			}
		}
		if (!isDone) {

			for (int i = arr.length - 1; i > 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] < arr[j]) {

						cr++;
					}
				}
			}
			System.out.println(cr);
		} else
			System.out.println("Too chaotic");

	}
}
