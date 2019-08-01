package com.collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<Character, Character> map1 = new HashMap<Character, Character>();
		map1.put('1', 'l');
		map1.put('0', 'O');
		map1.put('4', 'd');
		
		System.out.print("1.使用forEach+set\n");
		for (Character key : map1.keySet()) {
			System.out.println("key:" + key + ",maps value:'" + map1.get(key) + "'");
		}
		
		System.out.print("\n2.使用forEach+entry\n");
		for (Map.Entry<Character, Character> entry : map1.entrySet()) {
			System.out.println("key:" + entry.getKey() + ",maps value:'" + entry.getValue() + "'");
		}
		
		System.out.println("\n3.使用迭代器\n");
	    Iterator<Map.Entry<Character, Character>> it = map1.entrySet().iterator();
	    while (it.hasNext()) {
	    	Map.Entry<Character, Character> entry = it.next();
	    	System.out.println("key:" + entry.getKey() + ",maps value:'" + entry.getValue() + "'");
	    }
	    
	    System.out.println("\n映射替换测试\n");
	    Character[] pswd = {'2', '4', '6', '1', '9', '9', '0', '3'};	    
	    for (int i = 0; i < pswd.length; i++) {
	    	System.out.print(pswd[i] + " ");
	    	if (map1.containsKey(pswd[i])) {
	    		pswd[i] = map1.get(pswd[i]);
	    	}
	    }
	    System.out.println("\n");
	    for (int i = 0; i < pswd.length; i++) {
	    	System.out.print(pswd[i] + " ");
	    }
	    
	    
	}
}
