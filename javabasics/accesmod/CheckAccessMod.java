package com.te.javabasics.accesmod;

public class CheckAccessMod {

	public void pubMeth() {
		System.out.println("its public method");
	}

	protected void proMeth() {
		System.out.println("its protected method");
	}

	void defMeth() {
		System.out.println("its default method");
	}

	private void priMeth() {
		System.out.println("its private method");
	}

	public static void main(String[] args) {

		CheckAccessMod accessMod = new CheckAccessMod();
		accessMod.pubMeth();
		accessMod.defMeth();
		accessMod.proMeth();
		accessMod.priMeth();
	}

}
