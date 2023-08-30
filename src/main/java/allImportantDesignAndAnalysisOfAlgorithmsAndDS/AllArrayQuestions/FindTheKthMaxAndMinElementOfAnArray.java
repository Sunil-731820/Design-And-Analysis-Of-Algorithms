package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class FindTheKthMaxAndMinElementOfAnArray {
	
	static void sortingTheData(int size , int[] numbers) {
		for(int i=0;i<size;i++) {
			for(int j= i+1;j<size;j++) {
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
	
	static void getTheKthMaxAndMinElementOfTheArray(int size , int numberOfArray[], int Kth) {
		
//		Sorting The Data 
		sortingTheData(size, numberOfArray);
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is the Example Of The Find the “Kth” max and min element of an array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int size = sc.nextInt();
		int numberOfArray[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in The Array :");
			numberOfArray[i] = sc.nextInt();
		}
		System.out.println("The Array ofThe Element is :");
		for(int i=0;i<size;i++) {
			System.out.print(numberOfArray[i] + " ");
		}
		System.out.println("Enter The Kth Element to find the Maximum Value ");
		int kth = sc.nextInt();
		System.out.println("The Kth Maximum value is : "+numberOfArray[kth]);
		getTheKthMaxAndMinElementOfTheArray(size, numberOfArray, kth);
	}

}
