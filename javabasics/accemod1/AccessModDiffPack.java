package com.te.javabasics.accemod1;

import com.te.javabasics.accesmod.CheckAccessMod;

public class AccessModDiffPack extends CheckAccessMod {
	
	public static void main(String[] args) {
		
		
	
		CheckAccessMod accessMod = new CheckAccessMod();
		AccessModDiffPack accessModDiffPack = new AccessModDiffPack();
		
		accessMod.pubMeth();
		accessModDiffPack.proMeth();

		accessModDiffPack.pubMeth();
	}	
	
	
}
