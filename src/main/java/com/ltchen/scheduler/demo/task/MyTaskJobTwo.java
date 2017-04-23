package com.ltchen.scheduler.demo.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("myTaskJobTwo")
public class MyTaskJobTwo {

	private String jobName = "myTaskJobTwo";

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	@Scheduled(cron = "*/10 * * * * ?")
	public void sayHello(){
		System.out.println(new Date() + " : hi,I am a " + this.getJobName());
	}
}
