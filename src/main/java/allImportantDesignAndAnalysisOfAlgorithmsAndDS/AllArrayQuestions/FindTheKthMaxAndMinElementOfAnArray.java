package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class FindTheKthMaxAndMinElementOfAnArray {
	
//	Sorting The Data Using Linear Sort
	static void getSortingMethod(int size , int [] arr) {
		for(int i=0;i<size;i++) {
			for(int j= i+1;j<size;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting the Data is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void getKthMaximumvalue(int size , int [] arr) {
		getSortingMethod(size, arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Kth maximum value ");
		int Kthmaximumvalue = sc.nextInt();
		System.out.println("The kthe Maximum value is : "+ arr[Kthmaximumvalue-1]);
	}
	public static void main(String[] args) {
		System.out.println("This is The Example of The finding the Kth maximum And kth Minimum value ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Before CalliNg The getKthMaximumvalue is : ");
		getKthMaximumvalue(size, arr);
		
	}

}
