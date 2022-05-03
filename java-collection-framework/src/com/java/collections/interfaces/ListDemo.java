package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mausam pc
 *
 */
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	List<String> list = new ArrayList<>();
	
	list.add("element1");
	list.add("element1");
	list.add("element1");
	list.add("element1");
	
	System.out.println(list);
	
	list.add(null);
	list.add(null);
	
	System.out.println(list);
	
	//access elements from list
	System.out.println(list.get(0));
	System.out.println(list.get(3));

	}

}
