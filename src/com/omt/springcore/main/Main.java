package com.omt.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw = (HelloWorld) ac.getBean("helloWorld");
		System.out.println(hw.getMessage());
	}

}
