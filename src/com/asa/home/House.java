package com.asa.home;

public class House {

	private Bathroom bathroom;
	
	public Bathroom getBathroom() {
		return bathroom;
	}

	public void setBathroom(Bathroom bathroom) {
		this.bathroom = bathroom;
	}
	
	public void setShower(){
		bathroom.setShower();
	}
}
