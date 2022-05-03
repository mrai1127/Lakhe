package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<>();

		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Ford");
		cars.add("Mitsubishi");
		cars.add("Cadillac");

		System.out.println(cars);

		cars.remove(3);
		System.out.println("after removing element at index 3 ==> " + cars);
		
		cars.remove("Toyota");
		
		System.out.println("After rmoving Toyota element at index 0 ==>" + cars);
		
		
		List <String> subcarsList = new ArrayList<>();
		subcarsList.add("Cadillac");
		subcarsList.add("ford");
		
		cars.removeAll(subcarsList);
		System.out.println(cars);
		
		cars.clear();
		System.out.println(cars);
	}

}
