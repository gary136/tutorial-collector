package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
//		old method
//		Alien obj = new Alien();
		
//		springboot
//		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		Alien obj = context.getBean(Alien.class);		
//		obj.code();
		
//		xml base
//		deprecated
//		BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
//		spring automatically created the bean according to configuration if scope = "singleton"
		Alien obj1 = (Alien)factory.getBean("alien");
		obj1.code();
//		obj1.age = 15;
		System.out.println(obj1.getAge());
//		
//		Alien obj2 = (Alien)factory.getBean("alien");
//		obj2.code();
//		System.out.println(obj2.age); 
	}

}
