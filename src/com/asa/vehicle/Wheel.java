package com.asa.vehicle;

public class Wheel {

	private String wheelBrand;
	
	public void rotate(){
		System.out.println("Car is being moved by " + getWheelBrand() + " wheels ");
	}
	
	public void setWheelBrand(String wheelBrand){
		this.wheelBrand = wheelBrand;
	}
	
	public String getWheelBrand(){
		return wheelBrand;
	}
}

