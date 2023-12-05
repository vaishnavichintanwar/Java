import java.util.*;

/*
	1)
	Create a class called Invoice that a hardware store might use to represent
	an invoice for an item sold at the store. An Invoice should include four
	pieces of information as instance variables—a part number (type String), a
	part description (type String), a quantity of the item being purchased (type
	int) and a price per item (double). Your class should have a constructor
	that initializes the four instance variables. Provide a set and a get method
	for each instance variable. calculates the invoice amount (i.e. multiplies the
	quantity by the price per item), then returns the amount as a double value.
	
	If the quantity is not positive, it should be set to 0.
	If the price per item is not positive, it should be set to 0.0.
	Write a test application named InvoiceTest that demonstrate class Invoice’s
	capabilities.

*/

class Invoice
{
	
	String part_no;
	String part_desc;
	int quantity;
	double price;
	
	
	public Invoice() {
	
	}


	public Invoice(String part_no, String part_desc, int quantity, double price) {
		
		this.part_no = part_no;
		this.part_desc = part_desc;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPart_no() {
		return part_no;
	}


	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}


	public String getPart_desc() {
		return part_desc;
	}


	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	
	public int getQuantity() {
		
		return quantity;
	}


	public void setQuantity(int quantity) {
		if(quantity >= 0) {
			this.quantity = quantity;
		}
		else {
			quantity = 0;
		}
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if(price>=0)
			this.price = price;
		else
			price = 0.0;
	}
	
	double invoiceAmount() {
		double invoice_amount = getPrice()*getQuantity();
		return invoice_amount;
	}
	
	
}

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Invoice i = new Invoice();
		String p_no;
		String p_desc;
		int quant;
		double pr;
		
		System.out.println("enter Part_no: ");
		p_no = sc.next();
		System.out.println("enter Part_Desc: ");
		p_desc = sc.next();
		System.out.println("enter Price: ");
		quant = sc.nextInt();
		System.out.println("enter Quantity: ");
		pr = sc.nextDouble();
		
		
		i.setPart_no(p_no);
		i.setPart_desc(p_desc);
		i.setPrice(pr);
		i.setQuantity(quant);
		
		System.out.println("******************Information*****************************");
		System.out.println(i.getPart_no());
		System.out.println(i.getPart_desc());
		System.out.println(i.getPrice());
		System.out.println(i.getQuantity());
		System.out.println("calculation: "+i.invoiceAmount());
		
		
		
		
	}

}
