import java.util.Scanner;

// Q7) accept a number from user from command line argument, and reverse it.(use wrapper class predefined methods)

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number: ");
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		int rev=0;
		int rem;
		int m=n;
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		}
			
		
		System.out.println("Reverse of "+m+" is "+rev);
		
	}

}
