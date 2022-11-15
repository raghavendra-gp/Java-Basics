package com.te.javabasics.collectionmap;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("f", "embrace");
		hashMap.put("b", "black");
		hashMap.put("c", "collar");
		hashMap.put("d", "damn");
		hashMap.put("h", "embrace");
		hashMap.put("e", "120");
		hashMap.put("a", "apple");
		hashMap.put("g", "embrace");
		

		System.out.println(hashMap);

	}

}
