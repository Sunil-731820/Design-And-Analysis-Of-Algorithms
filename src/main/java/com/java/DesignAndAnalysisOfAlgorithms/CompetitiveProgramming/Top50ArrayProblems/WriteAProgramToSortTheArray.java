package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class WriteAProgramToSortTheArray {

	static void sortingTheArray(int size, int[] arr) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("This is The Example of Write a program to reverse the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter The Element In The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("After Sorting The Array is ");
		sortingTheArray(size, arr);
	}

}
