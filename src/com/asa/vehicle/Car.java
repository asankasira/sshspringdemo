package com.asa.vehicle;

public class Car {

	private Wheel wheel;
    private Wheel frontWheel;
	
	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public Wheel getFrontWheel() {
		return frontWheel;
	}

	public void setFrontWheel(Wheel frontWheel) {
		this.frontWheel = frontWheel;
	}

	public void move(){
		frontWheel.rotate();
		wheel.rotate();
	}
}
