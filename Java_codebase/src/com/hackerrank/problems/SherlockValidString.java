package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.List;

public class SherlockValidString {
	public static void main(String[] args) {
		System.out.println(isValid("abcdefghhgfedecba"));
	}

	public static String isValid(String s) {

		List<Character> ls = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (ls.contains(c)) {
				ls.remove(ls.lastIndexOf(c));
			} else
				ls.add(c);
		}
		if (ls.size() > 1)
			return "NO";
		return "YES";
	}

}
