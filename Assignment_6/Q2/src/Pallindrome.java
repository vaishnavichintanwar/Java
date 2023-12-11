// Q2) Write a java code to check string is palindrome.
import java.util.Scanner;




public class Pallindrome 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("enter a string: ");
		s = sc.next();
		System.out.println("string: "+s);
		StringBuffer s2 = new StringBuffer(s);
		s2.reverse();
		System.out.println("Reverse of string: "+s2);
		
		if(s.contentEquals(s2)) {
			System.out.println("Pallindrome");
		}
		else
			System.out.println("not a Pallindrome");
		
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());

	}

}


