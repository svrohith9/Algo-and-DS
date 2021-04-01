package com.leetcode.problems;

public class DetectCapital {

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("ggg"));
	}

	public static boolean detectCapitalUse(String word) {

		if (word.length() == 1)
			return true;

		int cap = 0, small = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				cap++;
			else
				small++;
		}

		if (cap == word.length() || small == word.length()
				|| (small == word.length() - 1 && Character.isUpperCase(word.charAt(0))))
			return true;
		else
			return false;
	}
}
