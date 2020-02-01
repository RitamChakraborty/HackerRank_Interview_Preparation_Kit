// https://www.hackerrank.com/challenges/new-year-chaos/problem

package arrays.new_year_chaos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	private static void minimumBribes(int[] arr) {
		int swapCount = 0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != (i + 1)) {
				if (i > 0 && arr[i - 1] == (i + 1)) {
					swapCount++;
					swap(arr, i - 1, i);
				} else if (i > 1 && arr[i - 2] == (i + 1)) {
					swapCount += 2;
					swap(arr, i - 2, i - 1);
					swap(arr, i - 1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		
		System.out.println(swapCount);
	}
	
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt();
		
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; ++i) {
				arr[i] = scanner.nextInt();
			}
			
			minimumBribes(arr);
		}
	}
}

