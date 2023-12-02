import java.util.*;

// Q5) Take two numbers from user, write a switch case statement to perform arithmetic operations.

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter first number:");
		int n = sc.nextInt();
		System.out.println("eneter second number:");
		int m = sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.Increment of second \n7.Decrement of second");
		System.out.println("eneter your choice:");
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: System.out.println(n+" + "+m+" = "+(n+m)); 
				break;
		case 2: System.out.println(n+" - "+m+" = "+(n-m)); 
				break;
		case 3: System.out.println(n+" * "+m+" = "+(n*m)); 
				break;
		case 4: System.out.println(n+" / "+m+" = "+(n/m)); 
				break;
		case 5	: System.out.println(n+" % "+m+" = "+(n%m)); 
				break;
		case 6	: System.out.println("++"+m+" = "+(++m)); 
				break;
		case 7	: System.out.println("--"+m+" = "+(--m)); 
				break;
		default: System.out.println("enter valid choice");
		}
	}

}
