package com.leetcode.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TwoCityScheduling {

	public static void main(String[] args) {
		int costs[][] = new int[][] { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
		System.out.println(twoCitySchedCost(costs));
	}

	public static int twoCitySchedCost(int[][] costs) {
		int arr[] = new int[costs.length];
		int res = 0;
		int i = 0;
		for (int a[] : costs) {
			res += costs[i][0];
			arr[i++] = a[1] - a[0];
		}
		Arrays.sort(arr);
		for (i = 0; i < costs.length / 2; i++)
			res += arr[i];
		return res;
	}

	public static int twoCitySchedCost2(int[][] costs) {
		Map<Integer, String> ts = new TreeMap<Integer, String>();
		for (int i = 0; i < costs.length; i++)
			ts.put(costs[i][0] - costs[i][1], String.valueOf(costs[i][0]) + " " + String.valueOf(costs[i][1]));
		int count = 0;
		int res = 0, res2 = 0;
		for (Map.Entry<Integer, String> t : ts.entrySet()) {
			if (count < costs.length / 2)
				res = res + Integer.parseInt(t.getValue().substring(0, t.getValue().lastIndexOf(' ')));
			else
				res = res + Integer.parseInt(t.getValue().substring(t.getValue().lastIndexOf(' ') + 1));
			count++;

		}
		res2 = 0;
		count = 0;
		for (Map.Entry<Integer, String> t : ts.entrySet()) {
			if (count > costs.length / 2)
				res2 += Integer.parseInt(t.getValue().substring(0, t.getValue().lastIndexOf(' ')));
			else
				res2 += Integer.parseInt(t.getValue().substring(t.getValue().lastIndexOf(' ') + 1));
			count++;

		}

		return Integer.min(res, res2);
	}

	public static int twoCitySchedCost3(int[][] costs) {
		Arrays.sort(costs, (a, b) -> (a[0] - b[0]) - (a[1] - b[1]));
		int res = 0;
		for (int i = 0; i < costs.length / 2; i++) {
			res += costs[i][0];
			res += costs[costs.length / 2 + i][1];
		}
		return res;
	}
}
