package com.hand.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-15
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Object handBean = applicationContext.getBean("handBean");
		System.out.println(handBean);
	}
}
