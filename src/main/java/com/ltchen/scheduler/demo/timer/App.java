package com.ltchen.scheduler.demo.timer;

import java.util.Calendar;
import java.util.Date;

public class App {
	
	public static Date getTime(int sec, int min, int hour){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, sec);
		calendar.set(Calendar.MINUTE, min);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		return calendar.getTime();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyTimer myTimer = new MyTimer();
		Date firstTime = App.getTime(11, 11, 11);
		long delay = 3000L;
		long period = 5000L;
		
		//指定时间执行定时任务,若已超时会立即执行
//		myTimer.schedule(new MyTimerTask(), firstTime);
		//指定第一次执行定时任务的时间并按一定的间隔重复执行,若已超时会立即执行一次
//		myTimer.schedule(new MyTimerTask(), firstTime, period);
		//指定延迟时间执行定时任务
//		myTimer.schedule(new MyTimerTask(), delay);
		//指定延迟时间执行定时任务并按一定的间隔重复执行
//		myTimer.schedule(new MyTimerTask(), delay, period);
		//指定第一次执行定时任务的时间并按一定的间隔重复执行,侧重按一定的执行频率,若已超时会立即执行错过的调度
//		myTimer.scheduleAtFixedRate(new MyTimerTask(), firstTime, period);
		//指定延迟时间执行定时任务并按一定的间隔重复执行,侧重按一定的执行频率,
//		myTimer.scheduleAtFixedRate(new MyTimerTask(), delay, period);
	}
}
