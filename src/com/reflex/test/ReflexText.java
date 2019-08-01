package com.reflex.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflexText {
	public static void main(String[] args) throws Exception {
		Class<?> toyClass = Class.forName("com.reflex.test.Toy");
		
		Method setPriceMethod = toyClass.getMethod("setPrice", int.class);
		Method getPriceMethod = toyClass.getMethod("getPrice");
		
		Constructor<?> toyConstructor = toyClass.getConstructor();
		
		Object toyObj = toyConstructor.newInstance();
		
		setPriceMethod.invoke(toyObj, 7);
		System.out.println("get toy price is " + getPriceMethod.invoke(toyObj) + ".");
	}
	
}
