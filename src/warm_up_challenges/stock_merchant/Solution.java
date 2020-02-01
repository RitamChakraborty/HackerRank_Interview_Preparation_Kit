// https://www.hackerrank.com/challenges/sock-merchant/problem

package warm_up_challenges.stock_merchant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		while (t-- > 0) {
			int m = scanner.nextInt();
			map.put(m, map.getOrDefault(m, 0) + 1);
		}
		
		int count = 0;
		
		for (int i : map.keySet()) {
			count += map.get(i) / 2;
		}
		
		System.out.println(count);
	}
}
