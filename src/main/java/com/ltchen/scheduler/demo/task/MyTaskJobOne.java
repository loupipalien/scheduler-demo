package com.ltchen.scheduler.demo.task;

import java.util.Date;

public class MyTaskJobOne {

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
