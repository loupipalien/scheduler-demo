package com.ltchen.scheduler.demo.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	//记录方法被调用的次数
	private static int count = 1;
	
	@Override
	public void run() {
		System.out.println(count++ + " : " + new Date() + " : " + Thread.currentThread().getName()+" : MyTimerTask is executed...");
	}

}
