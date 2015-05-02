package com.asa.drawings;

import java.awt.Point;

public class Traingle extends Shape {

	private Point point;
	
	@Override
	public void draw() {
		System.out.println("Traingle is drawn x=" + point.x + " y=" + point.y);
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}
