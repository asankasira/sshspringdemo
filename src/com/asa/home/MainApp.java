package com.asa.home;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainApp {
	public static void main(String[] args) {
		
		//Old way (before spring 3)
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		//New way
		BeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
//		reader.loadBeanDefinitions(new FileSystemResource("spring_beans.xml"));
		reader.loadBeanDefinitions(new ClassPathResource("Beans.xml"));

		HelloWorld obj = (HelloWorld) beanFactory.getBean("helloWorld");
		obj.getMessage();
		
		System.out.println("\n******************************\n");
		
		House house = (House) beanFactory.getBean("house");
		house.setShower();
		
	}
}