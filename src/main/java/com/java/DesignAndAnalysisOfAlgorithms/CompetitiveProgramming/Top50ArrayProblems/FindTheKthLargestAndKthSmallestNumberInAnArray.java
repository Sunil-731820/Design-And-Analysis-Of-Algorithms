package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class FindTheKthLargestAndKthSmallestNumberInAnArray {
	
	static void getSortingTheArrayInDescendingOrder(int size , int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Array After Sorting using Descending order ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void getSortingTheArrayInAscendingOrder(int size , int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Array After Sorting using Ascending  order ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void getKthLargestNumber(int size , int[] arr) {
		getSortingTheArrayInDescendingOrder(size, arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kth Largest Number By the USer ");
		int KthLargestNumberTaken = sc.nextInt();
		System.out.println("The KthLargest Number is "+ arr[KthLargestNumberTaken+1]);
		
	}
	
	static void getKthSmallestNumber(int size , int[] arr) {
		getSortingTheArrayInAscendingOrder(size, arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kth Smallest  Number By the USer ");
		int KthLargestNumberTaken = sc.nextInt();
		System.out.println("The KthSmallest  Number is "+ arr[KthLargestNumberTaken+1]);
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("This is The Example Of the FindTheKthLargestAndKthSmallestNumberInAnArray");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array is ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array ");
			arr[i] = sc.nextInt();
		}
		getSortingTheArrayInAscendingOrder(size, arr);
		getKthSmallestNumber(size, arr);
		getSortingTheArrayInDescendingOrder(size, arr);
		getKthLargestNumber(size, arr);
		
	}

}
