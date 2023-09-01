package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class MoveAllNegativeElementintoOneSideOfTheAray {
	
	static void getMoveAllnegativetoOneSide(int size , int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("This is the Example of the Moving the Element into the one Side of The array is ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element In the Array is ");
			arr[i] = sc.nextInt();
		}
		getMoveAllnegativetoOneSide(size, arr);
	}

}
