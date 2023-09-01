package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class SortingTheZeroOneAndTwoElementinTheArrayExample {
	
	static void getSortedData(int size , int[] arr) {
		System.out.println("After Sorting The Data is ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example of The Sorting the Given Array ");
		System.out.println("Enter The Size Of The Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		getSortedData(size, arr);
		System.out.println("After Sorting the Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
