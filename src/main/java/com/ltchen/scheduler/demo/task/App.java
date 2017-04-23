package com.ltchen.scheduler.demo.task;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) throws IOException {  
		  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "spring-task.xml" });  
        context.start();  
  
        System.out.println("输入任意按键退出 ~ ");  
        System.in.read();  
        context.close();  
    } 
}
