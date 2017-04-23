package com.ltchen.scheduler.demo.quartz;

import java.util.Date;

public class MyJobBean {

	private String jobName;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public void sayHello(){
		System.out.println(new Date() + " : hi,I am a " + this.getJobName());
	}
}
