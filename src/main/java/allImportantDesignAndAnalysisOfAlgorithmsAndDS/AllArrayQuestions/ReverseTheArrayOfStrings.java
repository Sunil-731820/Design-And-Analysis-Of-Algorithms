package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseTheArrayOfStrings {
	public static void getReverseOfTheStrings() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array of The String ");
		int size = sc.nextInt();
		String arrayOfString[] = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The String Value in The Array is : ");
			arrayOfString[i] = sc.next();
		}
		System.out.println("The Array of The String is : ");
		for(int i=0;i<size;i++) {
			System.out.print(arrayOfString[i]+ " ");
		}
		System.out.println("\n after reverse Of The String is : ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arrayOfString[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Reverse the Arary of The String Using Java :");
		getReverseOfTheStrings();
	}

}
