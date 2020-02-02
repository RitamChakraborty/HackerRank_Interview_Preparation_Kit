// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

package greedy_algorithm.minimum_absolute_difference_in_an_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(minimumAbsoluteDifference(arr));
    }
}
