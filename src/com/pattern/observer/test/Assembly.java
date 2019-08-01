package com.pattern.observer.test;

import java.util.ArrayList;


public class Assembly {
	private ArrayList<Task> tasks = new ArrayList<>();
	private ArrayList<AdventurerInterface> adventurers = new ArrayList<>();
	
	public void addTask(Task task) {
		this.tasks.add(task);
		this.adventurerSeeingTask(task);
	}
	
	public void AdventurerJoin(AdventurerInterface adventurer) {
		this.adventurers.add(adventurer);
	}
	
	public void AdventurerLeave(AdventurerInterface adventurer) {
		this.adventurers.remove(adventurer);
	}
	
	public void adventurerSeeingTask(Task task) {
		this.adventurers.forEach(adventurer -> adventurer.seeNewTask(task));
	}
}
