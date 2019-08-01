package com.collection.test;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<>();
		for (int i = 0; i < 100; i++) {
			vector1.add(i);
		}
		
		System.out.print("1.使用迭代器\n"); 					//迭代器在遍历中不会越界
		Iterator<Integer> it = vector1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}		
		
		System.out.print("\n2.使用forEach\n");
		for (Integer i : vector1) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n3.使用for+get下标\n");
		for (int i = 0; i < vector1.size(); i++) {
			System.out.print(vector1.get(i) + " ");
		}
		
		
	}
}
