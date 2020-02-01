// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

package sorting.sorting_bubble_sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; ++i) {
			arr[i] = scanner.nextInt();
		}
		
		int swapCount = 0;
		
		for (int i = 0; i < n; ++i) {
			for (int j = (i + 1); j < n; ++j) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					++swapCount;
				}
			}
		}
		
		System.out.println("Array is sorted in " + swapCount + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n - 1]);
	}
}

