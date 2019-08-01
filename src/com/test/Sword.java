package com.test;

public class Sword extends Weapon {	
	public Sword() {
		this.weaponTypeId = 1;	
	}
	
	public Sword(String newName, int newId) {
		super(newName, newId);
		this.weaponTypeId = 1;			
	}
}
