package com.pattern.observer.test;

public class AssemblyTest {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		Assembly assembly = new Assembly();
		assembly.AdventurerJoin(new AdventurerInterface() {
			private int taskCount = 0;
			
			@Override
			public void seeNewTask(Task task) {
				taskCount++;
				System.out.println("新的任务已发布，id为： " + task.getTaskId() + "，任务名“" + task.getTaskName() + "”。");
				System.out.println("当前已发布任务数：" + this.taskCount + "。\n");
			}
		});
		assembly.addTask(new Task("采摘雪山草", 5802));
		assembly.addTask(new Task("鹿角采集", 125));
		assembly.addTask(new Task("食材探索", 802));
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
	}
}
