package com.ltchen.scheduler.demo.quartz;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyQuartzJobBean extends QuartzJobBean {

	private String jobName;
	private MyJobBean myJobBean;
	
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public MyJobBean getMyJobBean() {
		return myJobBean;
	}

	public void setMyJobBean(MyJobBean myJobBean) {
		this.myJobBean = myJobBean;
	}

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println(new Date() + " : hi,I am a " + this.getJobName());
		this.getMyJobBean().sayHello();
	}

}
