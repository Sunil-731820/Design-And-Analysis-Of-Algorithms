package com.java.DesignAndAnalysisOfAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class EXample {
	
	static final ArrayList getResultsMethod() {
		ArrayList list = new ArrayList<>();
//		list.add(null);
		System.out.println("The Size Of The Array List is : "+ list.size());
		if(list ==null || (list !=null && list.isEmpty())) {
			System.out.println("Inside the if Block : "+ list.size());
			return list;
		}
		else {
			System.out.println("Inside The Else Block : "+ list.size());
			return new ArrayList<>();
		}
		
	}

	public static void main(String[] args) {
//		System.out.println("The Main Method is Srtart ");
		try {
			System.out.println("Inside The Try ");
			if(getResultsMethod()!=null) {
				System.out.println("The List is Empty : ");
			}else {
				System.out.println("The List Is Not EMpty : "+getResultsMethod());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside The catch Block : ");
			System.out.println(e);
		}
		
	}

}
