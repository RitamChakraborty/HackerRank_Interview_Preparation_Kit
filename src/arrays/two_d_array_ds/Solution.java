// https://www.hackerrank.com/challenges/2d-array/problem

package arrays.two_d_array_ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	private static int singleHourglassSum(Integer[][] arr) {
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					if (j == 1) {
						sum += arr[i][j];
					}
				} else {
					sum += arr[i][j];
				}
			}
		}
		
		return sum;
	}
	
	private static int maxHourGlassSum(int[][] arr) {
		Integer[][][][] hourglassList = new Integer[4][4][3][3];
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						hourglassList[i][j][k][l] = arr[i + k][j + l];
					}
				}
				
				list.add(singleHourglassSum(hourglassList[i][j]));
			}
		}
		
		return Collections.max(list);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; ++i) {
			for (int j = 0; j < 6; ++j) {
				int m = scanner.nextInt();
				arr[i][j] = m;
			}
		}
		
		System.out.println(maxHourGlassSum(arr));
	}
}