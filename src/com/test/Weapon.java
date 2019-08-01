package com.test;

public class Weapon {
	private String name;
	private int id;
	protected int weaponTypeId;
	
	
	public Weapon() {
		this.name = "";
		this.id = 0;
		this.weaponTypeId = 0;
	}
	
	public Weapon(String newName, int newId) {
		this.name = newName;
		this.id = newId;
		this.weaponTypeId = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;			
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public void showWeapon()
	{
		String weaponType = new String();
		if (weaponTypeId == 1)
			weaponType = "sword";
		else if (weaponTypeId == 2)
			weaponType = "axe";
		System.out.println("This is a " + weaponType + " named " + this.name + ",id is " + this.id);
	}
}
