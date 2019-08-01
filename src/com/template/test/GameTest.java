package com.template.test;

public class GameTest {
	public static void main(String[] args) {
		Game game1 = new Poker();
		Game game2 = new Football();
		game1.play();
		System.out.print("\n");
		game2.play();
	}
}
