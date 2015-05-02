package com.asa.home;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bathroom{

	private String fittings;
	private int year;
	
	
	public String getFittings() {
		return fittings;
	}
	public void setFittings(String fittings) {
		this.fittings = fittings;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setShower(){
		System.out.println("Installed with " + getFittings() + " since " + getYear());
	}
}
