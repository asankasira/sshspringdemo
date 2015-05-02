package com.asa.drawings;

public abstract class Shape {

	private String type;
	
	public void execute(){
		System.out.println(type);
		draw();
	}
	
	public abstract void draw();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
