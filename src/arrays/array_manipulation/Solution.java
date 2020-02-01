// https://www.hackerrank.com/challenges/crush/problem

package arrays.array_manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	private static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n + 1];
		
		for (int[] query : queries) {
			int a = query[0] - 1;
			int b = query[1];
			int k = query[2];
			
			arr[a] += k;
			arr[b] -= k;
		}
		
		
		long max = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < n + 1; i++) {
			sum += arr[i];
			max = Long.max(sum, max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] queries = new int[m][3];
		
		for (int i = 0; i < m; ++i) {
			queries[i][0] = scanner.nextInt();
			queries[i][1] = scanner.nextInt();
			queries[i][2] = scanner.nextInt();
		}
		
		System.out.println(arrayManipulation(n, queries));
	}
}
