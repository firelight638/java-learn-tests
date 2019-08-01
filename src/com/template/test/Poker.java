package com.template.test;

public class Poker extends Game{
	@Override
	void initialize() {
		System.out.println("扑克游戏初始化完成");
	}
	
	@Override
	void startGame() {
		System.out.println("开始扑克游戏");
	}
	
	@Override
	void endGame() {
		System.out.println("结束扑克游戏");
	}
}
