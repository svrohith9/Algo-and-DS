package com.leetcode.problems;

import java.util.HashMap;
import java.util.stream.Stream;

public class HashMaptoInteger {
	
	/*
	 * input : 'a, 'b', 'a'
	 * 
	 * a-count = 2 b-count = 1
	 * 
	 * output: a2b
	 */
	

	public static void main(String[] args) {

		char chars[] = new char[] { 'a', 'b', 'a' };
		System.out.println(compress(chars));
	}

	public int[] decompressRLElist(int[] nums) {
		String st = "";
		for (int i = 0; i < nums.length; i = i + 2)
			st = st + String.format("%0" + nums[i] + "d", 0).replace("0", String.valueOf(nums[i + 1]) + ",") + ",";
		return Stream.of(st.split(",")).mapToInt(str -> Integer.parseInt(str)).toArray();
	}

	public static int compress(char[] chars) {

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (char c : chars) {
			if (hs.containsKey(c))
				hs.put(c, hs.get(c) + 1);
			else
				hs.put(c, 1);
		}
		chars = hs.toString().replace('{', ' ')
				.replace('=', ' ')
				.replace('1', ' ')
				.replace(',', ' ')
				.replace('}', ' ')
				.replaceAll(" ", "").toCharArray();
		System.out.println(chars);
		return (hs.toString()).replace('{', ' ')
				.replace('=', ' ')
				.replace('1', ' ')
				.replace(',', ' ').replace('}', ' ')
				.replaceAll(" ", "").toString().length();

	}

}