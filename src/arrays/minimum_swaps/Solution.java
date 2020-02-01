// https://www.hackerrank.com/challenges/minimum-swaps-2/problem

package arrays.minimum_swaps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	private static int swapCount;
	
	static {
		swapCount = 0;
	}
	
	static int minimumSwaps(int[] arr) {
		while (!isSorted(arr)) {
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] - 1) != i) {
					swap(arr, i, arr[i] - 1);
				}
			}
		}
		
		return swapCount;
	}
	
	static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - 1 != i) {
				return false;
			}
		}
		
		return true;
	}
	
	static void swap(int[] arr, int a, int b) {
		swapCount++;
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(minimumSwaps(arr));
	}
}
