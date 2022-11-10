package com.te.javabasics.ArrayListProg;

public class MyArrayLi {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayListDemo arrayListDemo = new ArrayListDemo();
			arrayListDemo.add(10);
			arrayListDemo.add(20);
			arrayListDemo.add(30);
			arrayListDemo.add(40);
			arrayListDemo.add(50);
			arrayListDemo.add(60);
			arrayListDemo.add(70);
			arrayListDemo.add(80);
			arrayListDemo.add(90);
			arrayListDemo.add(100);
			arrayListDemo.add(110);
			arrayListDemo.add(120);
			arrayListDemo.add(130);
			arrayListDemo.add(140);

			System.out.println(arrayListDemo);
			
			System.out.println("-----------------------");
			
			System.out.println(arrayListDemo.size());
			System.out.println("------------------------");
			
			for(int i=0; i<arrayListDemo.size();i++)
				System.out.println(arrayListDemo.get(i));
			
			System.out.println("----------------------");
			
			
	}

}
