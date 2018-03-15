package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySortImpl {

	@Autowired
	@Qualifier("quick")
	private sortAlgorithm SortAlgorithim;
	
/*	public BinarySortImpl(sortAlgorithm SortAlgorithm) {
		super();
		this.SortAlgorithm = SortAlgorithm;
	}*/

	public int BinarySearch(int[] numbers,int number2search){
		
		//sorting logic
		
		//BubbleSortAlgorithem bubbleSortAlgorithem = new BubbleSortAlgorithem();
		int[] sortednumbers = SortAlgorithim.sort(numbers);
		System.out.println(sortednumbers);
		System.out.println(SortAlgorithim);
		
		//search logic
		
		//return result
		return 3;
	}

}
