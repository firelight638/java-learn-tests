package com.collection.test;

import java.util.LinkedList;

public class LinkListTest {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		MyLinkList<Integer> myList = new MyLinkList<>();
//		myList.addNode(9);
//		myList.addNode(2);
//		myList.addNode(3);
//		System.out.println(myList);
//		System.out.println(myList.length());
//		myList.insentNode(4, 4);
//		System.out.println(myList);
//		myList.deleteNodeWithIndex(4);
//		System.out.println(myList);
		
		for (int i = 1; i < 10000; i++) {
			myList.addNode(i);
		}
		myList.deleteNodeWithIndex(100);
		System.out.println(myList);
		long t2 = System.currentTimeMillis();
		long timeOfMyList = t2 - t1;
		
		t1 = System.currentTimeMillis();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i < 10000; i++) {
			list.add(i);
		}
		list.remove(100);
		System.out.println(list);
		t2 = System.currentTimeMillis();
		long timeOfList = t2 - t1;
		
		System.out.println("mylist:" + timeOfMyList + "\njavalist:" + timeOfList);
	}
}
