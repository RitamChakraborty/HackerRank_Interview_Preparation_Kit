package sorting.mark_and_toys;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int count = 0;
		int totalPrice = 0;
		
		for (int price : prices) {
			totalPrice += price;
			if (totalPrice > k) {
				break;
			}
			
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] prices = new int[n];
		
		for (int i = 0; i < n; ++i) {
			prices[i] = scanner.nextInt();
		}
		
		System.out.println(maximumToys(prices, k));
	}
}
