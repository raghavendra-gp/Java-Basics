package com.te.javabasics.ArrayListProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList li = new ArrayList();

		li.add("Apple");
		li.add("Ball");
		li.add("Cat");
		li.add("Dog");
		li.add("Element");
		li.add("Fish");
		li.add("Good");

		System.out.println("For loop");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println();
		System.out.println("For each loop");
		
		for (Object object : li) {
			System.out.println(object);

		}
		System.out.println();
		System.out.println("Iterator");
		
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("List Iterator");
		
		ListIterator ittr = li.listIterator();
		while (ittr.hasNext()) {
			System.out.println(ittr.next());
		}
		System.out.println();
		while (ittr.hasPrevious()) {
			System.out.println(ittr.previous());
		}

	}

}
