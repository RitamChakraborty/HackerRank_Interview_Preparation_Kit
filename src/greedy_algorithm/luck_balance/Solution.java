// https://www.hackerrank.com/challenges/luck-balance/problem

package greedy_algorithm.luck_balance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	private static int luckBalance(int k, int[][] arr) {
		int luck = 0;
		List<Integer> list = new ArrayList<>();
		
		for (int[] ints : arr) {
			if (ints[1] == 0) {
				luck += ints[0];
			} else {
				list.add(ints[0]);
			}
		}
		
		list.sort(Collections.reverseOrder());
		for (int i = 0; i < list.size() && i < k; i++) {
			luck += list.get(i);
		}
		
		for (int i = k; i < list.size(); i++) {
			luck -= list.get(i);
		}
		
		return luck;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; ++i) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		System.out.println(luckBalance(k, arr));
	}
}
