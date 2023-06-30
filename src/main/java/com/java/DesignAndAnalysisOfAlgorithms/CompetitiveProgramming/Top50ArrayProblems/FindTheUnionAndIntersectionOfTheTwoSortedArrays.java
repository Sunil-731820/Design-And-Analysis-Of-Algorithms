package com.java.DesignAndAnalysisOfAlgorithms.CompetitiveProgramming.Top50ArrayProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindTheUnionAndIntersectionOfTheTwoSortedArrays {
	
	static void getTheUnionFromTheTwoSortedArray(int sizeOfFirstArray , int[] firstArray,int sizeOfSecondArray,int[] secondArray) {
		
		
	}
	
	static void getTheIntersectionFromTheTwoSortedArray(int sizeOfFirstArray , int[] firstArray,int sizeOfSecondArray,int[] secondArray) {
		Set<Integer> Intersect = new HashSet<Integer>();
//		Converting The First Array Into The List 
		List<Integer> list1 = new ArrayList<>();
		for(Integer arr : firstArray) {
			list1.add(arr);
		}
		System.out.println("The List After Converting Into The Array ");
		System.out.println(list1);
		
//		Converting the Second Array Into The List 
		List<Integer> list2 = new ArrayList<>();
		for(Integer arr2 : secondArray) {
			list2.add(arr2);
		}
		System.out.println("The List2 After Converting The Array Into The List is ");
		System.out.println(list2);
		
//		Now Converting The Both Into The Single Set 
		Intersect.addAll(list1);
		Intersect.addAll(list2);
		System.out.println("After Converting The List into The Set is ");
		System.out.println(Intersect);
	}
	public static void main(String[] args) {
		System.out.println("This is The Example of The Find the Union and Intersection of the two sorted arrays");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The ELement In The Array One By One  ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Size of The Second Array ");
		int sizeOfSecondArray = sc.nextInt();
		int[] secondArray = new int[sizeOfSecondArray];
		for(int j=0;j<size;j++) {
			System.out.println("Enter the Element In The Second Array");
			secondArray[j] = sc.nextInt();
		}
		getTheIntersectionFromTheTwoSortedArray(size, arr, sizeOfSecondArray, secondArray);	
		
	}

}
