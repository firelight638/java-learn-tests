package com.pattern.observer.test;

public class Task {
	private String taskName;
	private int taskId;
	
	public Task(String newName, int newId) {
		this.taskName = newName;
		this.taskId = newId;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public int getTaskId() {
		return this.taskId;
	}
	
	public void setTaskName(String newName) {
		this.taskName = newName;
	}
	
	public void setTaskId(int newId) {
		this.taskId = newId;
	}
}