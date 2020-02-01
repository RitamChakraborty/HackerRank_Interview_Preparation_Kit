// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

package arrays.arrays_left_rotation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Solution {
	private static int[] rotLeft(int[] a, int d) {
		int n = a.length;
		
		if (d % n == 0) {
			return a;
		} else {
			int[] arr = new int[n];
			if (d > n) {
				d %= n;
			}
			
			for (int i = 0; i < n; i++) {
				if ((d + i) < n) {
					arr[i] = a[d + i];
				} else {
					arr[i] = a[d + i - n];
				}
			}
			
			return arr;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		StringJoiner stringJoiner = new StringJoiner(" ");
		
		for (int i : rotLeft(arr, d)) {
			stringJoiner.add(String.valueOf(i));
		}
		
		System.out.println(stringJoiner.toString());
	}
}
