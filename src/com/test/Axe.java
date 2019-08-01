package com.test;

public class Axe extends Weapon {	
	public Axe() {
		this.weaponTypeId = 2;	
	}
	
	public Axe(String newName, int newId) {
		super(newName, newId);
		this.weaponTypeId = 2;			
	}
}