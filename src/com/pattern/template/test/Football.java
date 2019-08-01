package com.pattern.template.test;

public class Football extends Game {
	@Override
	void initialize() {
		System.out.println("一场足球赛已准备就绪");
	}
	
	@Override
	void startGame() {
		System.out.println("开始足球游戏");
	}
	
	@Override
	void endGame() {
		System.out.println("结束足球游戏");
	}
}
