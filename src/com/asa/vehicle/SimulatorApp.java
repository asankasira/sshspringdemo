package com.asa.vehicle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class SimulatorApp {

	public static void main(String[] args) {
				
		BeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory);
		reader.loadBeanDefinitions(new ClassPathResource("Beans.xml"));
		
		Car car = (Car)factory.getBean("car");
		car.move();
	}
}
