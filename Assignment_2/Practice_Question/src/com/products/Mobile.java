package com.products;

import java.util.*;
public class Mobile 
{
	String name;
	double price;
	
	Scanner sc = new Scanner(System.in);
	
	public Mobile() {
		
	}

	public Mobile(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name  + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public void accept() {
		System.out.println("enter name of Mobile :");
		name = sc.next();
		System.out.println("enter price of Mobile: ");
		price = sc.nextDouble();
	}
	
	public void disp() {
		System.out.println("name of Mobile :"+this.name);
		System.out.println("price of Mobile: "+this.price);
		
	}
	
	
}
