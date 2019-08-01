package com.collection.test;

public class MyLinkList<T> {
	Node head = null;
	
	public class Node {
		Node next = null;
		T data;
		public Node(T newData) {
			this.data = newData;
		}
	}
	
	public void addNode(T newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
			return;
		} 
		
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public boolean insentNode(T newData, int index) {
		if (index < 1 || index > this.length() + 1) {
			System.out.println("Error:Out of link list range:" + index + ",for length is:" + this.length());
			return false;
		} else if (index == 1) {
			Node newNode = new Node(newData);
			newNode.next = head;
			head = newNode;
			return true;
		} else if (index == this.length() + 1) {
			this.addNode(newData);
		} else {
			int i = 1;
			Node frontNode = head;
			Node currentNode = frontNode.next;
			Node newNode = new Node(newData);
			while (frontNode.next != null) {
				if (i == index-1) {
					newNode.next = currentNode;
					frontNode.next = newNode;
					return true;
				} else {
					frontNode = currentNode;
					currentNode = currentNode.next;
					i++;
				}
			}
		}
		return false;
	}
	
	public boolean deleteNodeWithIndex(int index) {
		if (index < 1 || index > this.length()) {
			System.out.println("Error:Out of link list range:" + index + ",for length is:" + this.length());
			return false;
		} else if (index == 1) {
			head = head.next;
			return true;
		} else {
			int i = 1;
			Node frontNode = head;
			Node currentNode = frontNode.next;
			while(frontNode.next != null) {
				if (i == index-1) {
					frontNode.next = currentNode.next;
					currentNode = null;
					return true;
				} else {
					frontNode = currentNode;
					currentNode = currentNode.next;
					i++;
				}
			}
		}
		return false;
	}
	
	public int length() {
		int length = 0;
		Node temp = head;
		while (temp.next != null) {
			length++;
			temp = temp.next;
		}
		length++;
		return length;
	}
	
	@Override
	public String toString() {
		Node temp = head;
		StringBuilder linkListString = new StringBuilder();
		linkListString.append("[");
		while (temp.next != null) {
			linkListString.append(temp.data + "->");
			temp = temp.next;
		}
		linkListString.append(temp.data + "->" + "null]");
		return linkListString.toString();
	}
}
