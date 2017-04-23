package com.ltchen.scheduler.demo.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {

	private Timer timer;
	
	public MyTimer(){
		timer = new Timer();
	}
	
	public void schedule(TimerTask task, Date time){
		System.out.println(new Date() + " : " + "指定时间执行定时任务...");
		timer.schedule(task, time);
	}
	
	public void schedule(TimerTask task, Date firstTime, long period){
		System.out.println(new Date() + " : " + "指定第一次执行定时任务的时间并按一定的间隔重复执行...");
		timer.schedule(task, firstTime, period);
	}
	
	public void schedule(TimerTask task, long delay){
		System.out.println(new Date() + " : " + "指定延迟时间执行定时任务...");
		timer.schedule(task, delay);
	}
	
	public void schedule(TimerTask task, long delay, long period){
		System.out.println(new Date() + " : " + "指定延迟时间执行定时任务并按一定的间隔重复执行...");
		timer.schedule(task, delay, period);
	}
	
	public void scheduleAtFixedRate(TimerTask task, Date firstTime, long period){
		System.out.println(new Date() + " : " + "指定第一次执行定时任务的时间并按一定的间隔重复执行,侧重按一定的执行频率...");
		timer.scheduleAtFixedRate(task, firstTime, period);
	}
	
	public void scheduleAtFixedRate(TimerTask task, long delay, long period){
		System.out.println(new Date() + " : " + "指定延迟时间执行定时任务并按一定的间隔重复执行,侧重按一定的执行频率...");
		timer.scheduleAtFixedRate(task, delay, period);
	}
	
}
