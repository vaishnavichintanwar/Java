import java.util.Scanner;

class Customers
{
	
	int acc_no;
	int balance_at_beg;
	int total_charge;
	int credits;
	int credit_limit;
	
	public Customers() {
		
	}
	
	public Customers(int acc_no,int balance_at_beg,int total_charge,int credits,int credit_limit){
		this.acc_no = acc_no;
		this.balance_at_beg = balance_at_beg ;
		this.total_charge = total_charge ;
		this.credits = credits ;
		this.credit_limit = credit_limit ;
	}
	
	
	void calculation() {
		int balance =  balance_at_beg + total_charge -credits;
		System.out.println("balance : "+balance);
		
		if(balance > credits) {
			System.out.println("Credit limit exceeded..");
		}
		
		else
			System.out.println("Thank you Selecting our Store..");
	}
	
	
}





public class Credit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int acc_no;
		int balance_at_beg;
		int total_charge;
		int credits;
		int credit_limit;
		
		System.out.println("enter account no: ");
		acc_no = sc.nextInt();
		
		System.out.println("enter balance at begining: ");
		balance_at_beg = sc.nextInt();
		
		System.out.println("enter Total charge: ");
		total_charge = sc.nextInt();
		
		System.out.println("enter Credits: ");
		credits = sc.nextInt();
		
		System.out.println("enter Credit Limit: ");
		credit_limit = sc.nextInt();
		
		Customers cust = new Customers(acc_no,balance_at_beg,total_charge,credits,credit_limit);
		
		// Customers cust = new Customers(111111,30000,20000,10000,30000);
		cust.calculation();
		

	}

}
