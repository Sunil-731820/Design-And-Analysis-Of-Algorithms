package allImportantDesignAndAnalysisOfAlgorithmsAndDS.AllArrayQuestions;

import java.util.Scanner;

class GetAllNumber {
	private int size ;
	private int number[] = new int[size];
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getNumber() {
		return number;
	}
	public void setNumber(int[] number) {
		this.number = number;
	}
	
}

public class ReverseTheArrayOfNumbers {
	
	public static void getReverseOfTheNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int arrOfnumbers[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array : =");
			arrOfnumbers[i] = sc.nextInt();
		}
		System.out.println("The Array of The Numbers is : ");
		for(int i=0;i<size;i++) {
			System.out.print(arrOfnumbers[i]+ " ");
		}
		System.out.println("\nAfter The Reverse Of The Numbers i s: ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arrOfnumbers[i]+ " ");
		}
	}
	public static void main(String[] args) {
		System.out.println("This is the Example Of tHe Reverse The Array of The Number in Java : =");
		getReverseOfTheNumbers();
	}
	

}
