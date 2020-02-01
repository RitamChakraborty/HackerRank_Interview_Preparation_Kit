// https://www.hackerrank.com/challenges/counting-valleys/problem

package warm_up_challenges.counting_vallieys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		String input = scanner.next();
		char[] chars = input.toCharArray();
		
		int height = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		
		for (char ch : chars) {
			if (ch == 'U') {
				++height;
			} else {
				--height;
			}
			
			list.add(height);
		}
		System.out.println(list);
		int count = 0;
		
		for (int i = 0; i < list.size() - 1; ++i) {
			if (list.get(i) == 0 && list.get(i + 1) < 0) {
				++count;
				
				while (i < list.size() - 1 && list.get(i + 1) < 0) {
					++i;
				}
			}
		}
		
		System.out.println(count);
	}
}
