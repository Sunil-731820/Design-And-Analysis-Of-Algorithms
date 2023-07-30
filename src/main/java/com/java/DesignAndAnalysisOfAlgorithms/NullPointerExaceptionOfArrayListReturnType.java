package com.java.DesignAndAnalysisOfAlgorithms;
import java.util.ArrayList;
import java.util.List;

public class NullPointerExaceptionOfArrayListReturnType {


	static final ArrayList getResultList() {
	    // Some logic to generate the list
		ArrayList resultList = null; // Some computation or initialization

	    if (resultList != null) {
	    	System.out.println("Inside The if Block : ");
	        return (ArrayList) resultList;
	    } else {
	        // Handle the case when the ArrayList is null
	        // For example, you can return an empty ArrayList or throw an exception
	    	System.out.println("Inside The Else Block Of The ");
	        return new ArrayList<>(); // Return an empty ArrayList
	    }
	}

	public static void main(String[] args) {
		System.out.println(getResultList());
	}

}
