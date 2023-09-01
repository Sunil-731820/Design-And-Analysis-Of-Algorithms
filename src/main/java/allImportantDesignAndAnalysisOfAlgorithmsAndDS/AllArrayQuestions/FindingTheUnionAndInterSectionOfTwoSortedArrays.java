package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

public class FindingTheUnionAndInterSectionOfTwoSortedArrays {
	
	static void getIntersectionofTheArray(int size , int[] number1 , int[] number2) {
		int[] tempArray = new int[size];
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(number1[i]==number2[j]) {
					tempArray[i] = number1[i] & number2[j];
				}
			}
		}
		System.out.println("The Inetrsection of The Array is ");
		for(int i=0;i<tempArray.length;i++) {
			System.out.print(tempArray[i]+ " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Finding Union and intersections :");
		Scanner sc = new Scanner(System.in);
		System.out.println("The Size of The First Array is ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		for(int i=0;i<size1;i++) {
			System.out.println("Enter The Element ");
			arr1[i] = sc.nextInt();
		}
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		for(int j=0;j<size2;j++) {
			System.out.println("Enter The Element in The Second Array is ");
			arr2[j] = sc.nextInt();
		}
		getIntersectionofTheArray(size1, arr1, arr2);
	}

}
