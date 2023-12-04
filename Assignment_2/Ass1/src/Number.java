// Accept a integer number and when the program is executed print the
// binary, octal and hexadecimal equivalent of the given number.

import java.util.*;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		//System.out.println("entered number = "+n);
		
		String bin = Integer.toBinaryString(n);
		System.out.println("Binary of "+n +" : "+bin);
		
		String oct = Integer.toOctalString(n);
		System.out.println("Octal of "+n +" : "+oct);
		
		String hex = Integer.toHexString(n);
		System.out.println("Hexadecimal of "+n +" : "+hex);
		
		
		
	}

}
