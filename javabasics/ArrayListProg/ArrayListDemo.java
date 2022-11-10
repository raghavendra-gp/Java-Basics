package com.te.javabasics.ArrayListProg;

import java.util.Arrays;

public class ArrayListDemo {

	private Object[] ar = new Object[5];
	private int pos;

	public void add(Object e) {
		if(pos >= ar.length)
			growArray();
		ar[pos] = e;
		pos++;

	}

	@Override
	public String toString() {
		return Arrays.toString(ar);
	}

	public Object get(int index) {
		return ar[index];
	}

	public int size() {
		return pos;
	}
	
	private void growArray() {
		Object[] temp = new Object[ar.length+5];
		System.arraycopy(ar, 0, temp, 0, ar.length);
		ar = temp;
	}

}
