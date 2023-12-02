import java.util.*;

// Q4) Accept a character from user and display its ascii value.

public class DisplayASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter character:");
		char ch = sc.next().charAt(0);
		System.out.println("ascii value of "+ch+" is: "+(int)ch);
	}

}
