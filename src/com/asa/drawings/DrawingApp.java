package com.asa.drawings;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {

	public static void main(String[] args) {

//		BeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("Beans.xml"));
		
		/** initialize all spring beans when the container starts **/
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		Shape shape1 = (Shape) context.getBean("shape-alias");
//		shape1.execute();
		
		System.out.println("\n****************");
		
		Shape shape2 = (Shape) context.getBean("shape-trian");
		shape2.execute();
		
		System.out.println("\n****************");
		
		Shape shape3 = (Shape) context.getBean("sqr");
		shape3.execute();
		
		System.out.println("\n****************");
		
		Shape shape4 = (Shape) context.getBean("rect");
		shape4.execute();
	}

}
