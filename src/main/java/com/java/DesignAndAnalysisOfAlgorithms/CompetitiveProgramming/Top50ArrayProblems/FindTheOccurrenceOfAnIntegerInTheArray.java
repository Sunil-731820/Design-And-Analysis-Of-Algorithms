package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class FindTheOccurrenceOfAnIntegerInTheArray {
	
	static void getOrFindTheOccurrenceOfAnIntegerInTheArray(int size , int[] arr ,int occurenceElement) {
		int count = 0;
		for(int i=0;i<size;i++) {
			if(arr[i]==occurenceElement) {
				count++;
			}
		}
		System.out.println("The Number of The Occurence of The Element is : "+ count);
	}
	public static void main(String[] args) {
		System.out.println("this is The Example Of The Find the occurrence of an integer in the array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter The Element for Counting The Number Of The Occurence in The Array");
		int occurenceElement = sc.nextInt();
		getOrFindTheOccurrenceOfAnIntegerInTheArray(size, arr, occurenceElement);
		
		
	}

}
