package com.products;
import java.util.*;
public class Laptop 
{
	public String name;
	public int price;
	Scanner sc = new Scanner(System.in);
	
	
	public Laptop() {
		
	}

	public Laptop(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name +"]";
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
		Laptop other = (Laptop) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	public void accept() {
		System.out.println("enter name of Laptop :");
		name = sc.next();
		System.out.println("enter price of Laptop: ");
		price = sc.nextInt();
	}
	
	public void disp() {
		System.out.println("name of Laptop :"+this.name);
		System.out.println("price of Laptop: "+this.price);
	}
	
	
	
}
