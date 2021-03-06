package com.asa.drawings;

import java.awt.Point;

public class Rectangle extends Square {
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	@Override
	public void draw() {
		System.out.println("Rectangle is created with x=" + point1.x + " y=" + point1.y);
		System.out.println("Rectangle is created with x=" + point2.x + " y=" + point2.y);
		System.out.println("Rectangle is created with x=" + point3.x + " y=" + point3.y);
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

}
