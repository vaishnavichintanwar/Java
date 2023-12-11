// Q1) Write a java program to reverse a String

import java.util.Scanner;

public class Revesre 
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
		
		System.out.println("************ 2nd way ************");
		
		String s3="";
		for(int i =s.length()-1;i>=0;i--) {
			s3+=s.charAt(i);
		}
		
		System.out.println(s3);
		

	}

}
