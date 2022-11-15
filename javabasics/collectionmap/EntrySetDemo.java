package com.te.javabasics.collectionmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetDemo {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("A", "Apple");
		hashMap.put("B", "Ball");
		hashMap.put("C", "Cat");
		hashMap.put("D", "Dog");
		System.out.println(hashMap);

		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			if (entry.getKey().equals("A"))
				entry.setValue("Antelope");

		}
		System.out.println(entrySet);
	}

}
