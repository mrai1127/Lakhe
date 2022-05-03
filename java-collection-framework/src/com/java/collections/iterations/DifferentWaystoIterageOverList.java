package com.java.collections.iterations;

import java.util.Arrays;
import java.util.List;

public class DifferentWaystoIterageOverList {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("java", "GoLang", "Python", "C#");

		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));

			for (String course : courses) {
				System.out.println(course);
			}
		}
	}

}
