package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> topProgrammingLanguages = new ArrayList<>();

		System.out.println("Is the topProgrammingLanguages list empty? :" + topProgrammingLanguages.isEmpty());

		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add("GoLang");
		topProgrammingLanguages.add("JavaScript");
		topProgrammingLanguages.add(".net");

		System.out
				.println("Here are the top " + topProgrammingLanguages.size() + " Programming Languages in the world");

		String bestProgrammingLang = topProgrammingLanguages.get(1);
		System.out.println("BestProgrammingLang -->" + bestProgrammingLang);

		// modify the element at a given indes
		topProgrammingLanguages.set(3, "C#");
		System.out.println(topProgrammingLanguages);
	}

}
