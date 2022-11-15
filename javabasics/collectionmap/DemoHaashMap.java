package com.te.javabasics.collectionmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHaashMap {
	public static void main(String[] args) {
		HashMap<String, String> hashMap;
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.put("A", "abc"));
		System.out.println(map.put("A", "xyz"));
		System.out.println(map.put("A", "mno"));
		System.out.println(map.put("B", "xbc"));

		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
//		hashMap.put("z", "zebra");
//		hashMap.put("a", "antelope");
//		hashMap.put("g", "gabba");
//		hashMap.put("g", "gopro");
//		hashMap.put("r", "razor");
//		hashMap.put("g", "razor");
//		hashMap.put("e", "razor");
//		hashMap.put("b", "razor");
//		hashMap.put("d", "razor");
//		hashMap.put(null, "ABC");
//		hashMap.put("g", "gabba");
//		hashMap.put("f", "razor");
//		hashMap.put("f", "razor");
//		hashMap.put("g", "gabba");
//		hashMap.put("h", "gabba");
//		hashMap.put("i", "gabba");
//		hashMap.put("j", "gabba");
//		hashMap.put("k", "gabba");
//		hashMap.put("l", "gabba");
//		
//		hashMap.put("f", "razor");
//		hashMap.put("f", "razor");
//		hashMap.put("r", "razor");
//
//		System.out.println(hashMap);
//		main();
	}

//	public static void main() {
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//
//		hashMap.put(1, "Apple");
//		hashMap.put(10, "Bank");
//		hashMap.put(253, "Control");
//		hashMap.put(523, "Bomb");
//
//		System.out.println(hashMap);
//	}
}
