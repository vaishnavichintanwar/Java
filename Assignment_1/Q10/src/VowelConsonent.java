
import java.util.*;
// Q10) Write a program to Check whether a character is a vowel or consonant using switch statement
public class VowelConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter a character: ");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'a':System.out.println("Vowel");
					break;
		case 'e':System.out.println("Vowel");
		break;
		
		case 'i':System.out.println("Vowel");
		break;
		
		case 'o':System.out.println("Vowel");
		break;
		
		case 'u':System.out.println("Vowel");
		break;
		
		default: System.out.println("Consonant");
		
		}
	}

}
