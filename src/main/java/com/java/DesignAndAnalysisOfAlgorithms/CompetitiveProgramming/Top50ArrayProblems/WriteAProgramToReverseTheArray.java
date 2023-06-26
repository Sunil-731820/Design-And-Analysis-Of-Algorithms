package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class WriteAProgramToReverseTheArray {
	
	static void  reverseTheGivenArray(int size , int[] arr) {
		for(int i = size-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("this is The Example of WriteAProgramToReverseTheArray");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		reverseTheGivenArray(size, arr);
	}

}
