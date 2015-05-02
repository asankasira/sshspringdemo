package com.asa.drawings;

public class Circle extends Shape {
	
	private int radius;
	private String size;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public Circle(String size, int radius) {
		this.size = size;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
	   System.out.println(size + " Circle is drawn with radius " + radius);
	}
}
