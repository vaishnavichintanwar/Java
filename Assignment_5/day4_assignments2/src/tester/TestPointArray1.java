package tester;
import com.app.geometry.*;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,index,choice,index1,index2;
		boolean t = true;
		
		
		System.out.println("Enter how many points do you want to plot: ");
		n = sc.nextInt();
		Point2D[] p = new Point2D [n];
		
		for(int i =0;i<n;i++) {
			p[i] = new Point2D();
			p[i].accept();
		}
		
		
		System.out.println("1) Display details of a specific point \n2) Display x, y co-ordinates of all points\n3)validate the indices and calculate distance \n4) Exit");
		while(t){
		System.out.println("Enter choice: ");
		choice = sc.nextInt();
		switch(choice) 
		{
		case 1: 
				System.out.println("enter index of point you want to display: ");
				index = sc.nextInt();
		
				if(index>=0 && index<n) 
					System.out.println(p[index].getDetails());
				else 
					System.out.println("Invalid index , pls retry!!!!");
				break;
				
		case 2: System.out.println("ALl points are: ");
			/*
				for(int i =0;i<n;i++) 
					System.out.println(p[i].getDetails());
				break;*/ 
		
				for(Point2D pobj:p) 
					System.out.println(pobj.getDetails());
				break;
						
		case 3: 
				System.out.println("Distance between two points Calculation");
				System.out.println("enter index of point : ");
				index1 = sc.nextInt();
				
				System.out.println("enter index of point : ");
				index2 =sc.nextInt();
				
				if(index1>=0 && index1<n && index2>=0 && index2<n) 
				{
					if(p[index1].equals(p[index2])) {
						System.out.println("Both points at same location.");
						
					}
					else{
						System.out.println(Point2D.calculateDistance(p[index1], p[index2]));
					}
				}
				break;
				
		case 4:
				System.out.println("Exit....");
				t=false;
				break;
		
		default: System.out.println("enter valid Choice.....");
			
		}	
		}
}
		
}
