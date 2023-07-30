package com.java.DesignAndAnalysisOfAlgorithms;

public class NullPointerExceptionsExample {
	static int[] getResultArray() {
	    int[] resultArray = null;
//	    System.out.println("the size of The Array is : "+resultArray.length);
	    if (resultArray != null) {
	    	System.out.println("The Value Inside The if Block is : "+resultArray[0]);
	    	System.out.println("Inside The if Blocks : ");
	        return resultArray;
	    } else {
	    	System.out.println("Inside The else  Blocks : ");
//	    	System.out.println("The Value Inside The else Block is : "+resultArray[0]);
	        return new int[0];
	    }
	}
public static void main(String[] args) {
	 int[] array = new int[0];
	 System.out.println("The Method Is Called ");
	 array = getResultArray();
	 System.out.println("After method Called ");
	 System.out.println(array);
	
}

}
