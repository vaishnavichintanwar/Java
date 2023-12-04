package com.store.tester;

import com.products.*;
import java.util.*;
public class Menu {
	static double total = 0;

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1)Mobile\n2)Laptop\n3)Ipad");
		
		int ch = 0;
		
		while(ch!=4) {
			
			System.out.println("Enter choice");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: 
					
					Mobile m = new Mobile();
					Mobile m2 = new Mobile();
					System.out.println("obj1 == obj2 :"+(m.equals(m2)));
					System.out.println("hashcode: "+m.hashCode());
					
					m.accept();
					m.disp();
					System.out.println("enter quantity: ");
					int n = sc.nextInt();
					total = total +(n*(m.getPrice()));
					System.out.println("total = "+total);
					break;
					
			case 2: Laptop l = new Laptop();
					Laptop l2 = new Laptop();	
					System.out.println("obj1 == obj2 :"+(l.equals(l2)));
					System.out.println("hashcode: "+l.hashCode());
					
					l.accept();
					l.disp();
					System.out.println("enter quantity: ");
					int n2 = sc.nextInt();
					total = total +(n2*(l.getPrice()));
					System.out.println("total = "+total);
					break;
			
				
			case 3: Ipad i = new Ipad();
					Ipad i2 = new Ipad();
					System.out.println("obj1 == obj2 :"+(i.equals(i2)));
					System.out.println("hashcode: "+i.hashCode());
					
					i.accept();
					i.disp();
					System.out.println("enter quantity: ");
					int n3 = sc.nextInt();
					total = total +(n3*(i.getPrice()));
					System.out.println("total = "+total);
					break;
					
			
					
			default: System.out.println("Enter valid choice");
				
			}
		}

	}

}
