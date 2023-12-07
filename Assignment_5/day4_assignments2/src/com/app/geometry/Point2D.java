package com.app.geometry;

import java.util.Objects;
import java.util.Scanner;

public class Point2D 
{
	int x,y;

	public Point2D() {
		super();
		
	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	public String getDetails() {
		return "x=" + x + ", y=" + y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
	
	public static String calculateDistance(Point2D p1, Point2D p2){
		double distance = Math.sqrt((Math.pow((p1.y-p2.y),2))+(Math.pow((p1.x-p2.x),2)));
		return "Distance = "+distance ;
	}
	
	public void accept() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x: ");
		setX(sc.nextInt()); 
		
		
		System.out.println("Enter y: ");
		setY(sc.nextInt());
		

	}
	

}
