package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> fruitcollection =new ArrayList<>();
	    fruitcollection.add("banana");
	    fruitcollection.add("Manago");
	    fruitcollection.add("apple");
	    System.out.println(fruitcollection);
	    
	    fruitcollection.remove("banana");
	    System.out.println(fruitcollection);
	    
	    System.out.println(fruitcollection.contains("apple"));
	    
	    fruitcollection.forEach((element) -> {
	    	System.out.println(element);
	    });
	    
	    fruitcollection.size();
	    System.out.println(fruitcollection);
	    

	}

}
