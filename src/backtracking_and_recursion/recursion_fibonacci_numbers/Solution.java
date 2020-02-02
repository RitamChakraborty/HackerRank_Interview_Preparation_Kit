// https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem

package backtracking_and_recursion.recursion_fibonacci_numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		
		System.out.println(fibonacci(n));
	}
}
