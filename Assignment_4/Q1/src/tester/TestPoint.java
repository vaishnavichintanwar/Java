package tester;
import com.app.geometry.*;
public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D(10,20);
		Point2D p2 = new Point2D(10,20);
		String result = Point2D.calculateDistance(p1, p2);
		if(p1.equals(p2))
			System.out.println("points are equal.");
		else 	
			System.out.println("Distance between two points : "+result);
	}

}
