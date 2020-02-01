// https://www.hackerrank.com/challenges/repeated-string/problem

package warm_up_challenges.repeated_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	private static int countA(String string) {
		int count = 0;
		char[] chars = string.toCharArray();
		
		for (char aChar : chars) {
			if (aChar == 'a') {
				count++;
			}
		}
		
		return count;
	}
	
	private static long repeatedString(String s, long n) {
		int aCount = countA(s);
		int size = s.length();
		boolean dividable = n % size == 0;
		
		long iteration = n / size;
		long count =  aCount * iteration;
		
		if (!dividable) {
			long rem = n % size;
			String subString = s.substring(0, (int) rem);
			count += countA(subString);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = scanner.next();
		long n = scanner.nextLong();
		
		System.out.println(repeatedString(s, n));
	}
}
