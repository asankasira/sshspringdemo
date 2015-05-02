package com.asa.drawings;

import java.awt.Point;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Square extends Shape implements ApplicationContextAware, BeanNameAware {

	private List<Point> points;
	private String beanName;
	
	@Override
	public void draw() {
	
		for (Point point : points) {
			System.out.println("Square is drawn with point  x=" + point.x + " y="+point.y);
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	/**
	 * Useful when bean dependencies needs to be created as prototypes. If parent object is singleton, 
	 * there is no use configuring dependencies as prototype in spring.xml
	 */
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("ApplicationContext is available inside " +beanName+ " Bean ..");	
	}

	@Override
	public void setBeanName(String beanName) {	
		this.beanName = beanName;
	}
}
