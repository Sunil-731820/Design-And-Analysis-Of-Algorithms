package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class SortTheArrayOf0s1sAnd2sOnlyELement {
	
	static void sortTheGivenArrayHave0And1And2Element(int size , int[] arr) {
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of Sort the array of 0s, 1s, and 2s");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		sortTheGivenArrayHave0And1And2Element(size, arr);
	}

}
