package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class FindTheMaximumAndMinimumElementInAnArray {
//	Sorting The Data 
	static void sortingTheData(int[] numbers, int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("The Array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(numbers[i]+ " ");
		}
	}
	
	static void getMaximumValueAndMinimumValueFromTheArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array :");
		int size = sc.nextInt();
		int numberOfMaxAndMinvalue[] = new int[size]; 
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In the Array : ");
			numberOfMaxAndMinvalue[i] = sc.nextInt();
		}
		System.out.println("The Array is after ENtering The value ");
		for(int i=0;i<size;i++) {
			System.out.print(numberOfMaxAndMinvalue[i]+ " ");
		}
//		Sorting The Data To Get Maximum And Minimum Value 
		sortingTheData(numberOfMaxAndMinvalue, size);
		System.out.println("\nThe Minimum value is : "+numberOfMaxAndMinvalue[0]);
		System.out.println("The Maximum value is : "+numberOfMaxAndMinvalue[size-1]);
	}
	public static void main(String[] args) {
		System.out.println("This is the Example Of The Find the maximum and minimum element in an array");
		getMaximumValueAndMinimumValueFromTheArray();
	}

}
