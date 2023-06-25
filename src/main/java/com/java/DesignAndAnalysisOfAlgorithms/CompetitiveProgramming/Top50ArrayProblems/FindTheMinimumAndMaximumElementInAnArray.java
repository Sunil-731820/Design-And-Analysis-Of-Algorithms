package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class FindTheMinimumAndMaximumElementInAnArray {

//	Sorting The Array In Descending Order 
	static void sortFindTheMinimumAndMaximumElementInAnArray(int size, int[] arr) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Sorted Array is ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
// Finding The Array First Maximum And First Minimum Element Array 
	static void getFindTheMinimumAndMaximumElementInAnArray(int size, int[] arr) {
		sortFindTheMinimumAndMaximumElementInAnArray(size, arr);
		System.out.println("The First Maximum Array is : " + arr[0]);
		System.out.println("The First Minimum Array is : " + arr[size - 1]);

	}

	public static void main(String[] args) {
		System.out.println("This is The EXample Of The Find the minimum and maximum element in an array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array is ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		getFindTheMinimumAndMaximumElementInAnArray(size, arr);
	}

}
