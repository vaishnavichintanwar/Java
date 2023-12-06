package com.app.geometry;

import java.util.Objects;
public class Point2D 
{
	
	public float x;
	public float y;
	
	public Point2D() 
	{
		
	}

	public Point2D(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	
	
	public String getDetails() {
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		return "x =" +s1+" y = "+s2;
		
		
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
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
	}
	
	public static String calculateDistance(Point2D p1, Point2D p2){
		double distance = Math.sqrt((Math.pow((p1.y-p2.y),2))+(Math.pow((p1.x-p2.x),2)));
		return "Distance = "+distance ;
	}
	
	
}
