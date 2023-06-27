package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.Scanner;

public class MoveAllTheNegativeElementsToOneSideOfTheArray {

	static void getMoveAllTheNegativeElementsToOneSideOfTheArray(int size, int[] arr) {
		int j =0,temp;
		for(int i=0;i<size;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println("The  Array is after Shifting Done  ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	public static void main(String[] args) {
		System.out.println("this is The Example of Move all the negative elements to one side of the array");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array");
			arr[i] = sc.nextInt();
		}
		getMoveAllTheNegativeElementsToOneSideOfTheArray(size, arr);
	}

}
