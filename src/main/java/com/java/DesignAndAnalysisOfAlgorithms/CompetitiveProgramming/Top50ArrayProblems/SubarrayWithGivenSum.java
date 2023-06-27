package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class SubarrayWithGivenSum {

	static void getSubarrayWithGivenSum(int size, int[] arr, int sum) {

		for (int i = 0; i < size; i++) {
			int currentSum = arr[i];

			if (currentSum == sum) {
				System.out.println("Sum found at indexe " + i);
				return;
			} else {
				// Try all sub arrays starting with 'i'
				for (int j = i + 1; j < size; j++) {
					currentSum += arr[j];

					if (currentSum == sum) {
						System.out.println("Sum found between indexes " + i + " and " + j);
						return;
					}
				}
			}
		}
		System.out.println("No subarray found");
		return;

	}

	public static void main(String[] args) {
		System.out.println("This is The EXample of The Subarray with given Sum");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("ENter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Given Sum for finding the Indexes from The Given Array");
		int sum = sc.nextInt();
		getSubarrayWithGivenSum(size, arr, sum);
	}

}
