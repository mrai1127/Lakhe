package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
	
		
		//create arraylist object
		
		List<Integer> firstFivePrimeNumber = new ArrayList<>();
		firstFivePrimeNumber.add(1);
		firstFivePrimeNumber.add(3);
		firstFivePrimeNumber.add(5);
		firstFivePrimeNumber.add(7);
		firstFivePrimeNumber.add(9);
		
		List <Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumber);
        
		List<Integer> nextFivePrimeNumbers = new ArrayList();
		nextFivePrimeNumbers.add(11);
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(29);
		nextFivePrimeNumbers.add(23);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
	}

}
