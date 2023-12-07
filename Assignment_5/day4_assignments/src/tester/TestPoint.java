package tester;
import com.app.geometry.*;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		p1.accept();
		p2.accept();
		
		System.out.println("Point P1: "+ p1.getDetails());
		System.out.println("Point P2: "+p1.getDetails());
		
		
		
		if (p1.equals(p2)) {
			System.out.println("Both points are located at same position." );
		}
		else {
			System.out.println(Point2D.calculateDistance(p1, p2));
		}
		
	}
		
}
