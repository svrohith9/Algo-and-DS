package com.code.compete;

import java.util.Scanner;

public class Solution_kickstart_group_h_2021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cr = 1;
		while (n-- > 0) {
			int min;
			int sum = 0;
			String st = sc.next();
			sc.nextLine();
			String st1 = sc.next();
			int x = 0;
			for (char c : st.toCharArray()) {
				min = Integer.MAX_VALUE;
				for (char ch : st1.toCharArray()) {
					int cur = Math.abs((int) c - (int) ch);
					if(cur>=13)
						cur=Math.abs(cur-26);						
					if (cur < min)
						min = cur;
				}
				sum += min;
			}
			System.out.println("Case #" + (cr++) + ": " + sum);
		}
		sc.close();
	}
}
