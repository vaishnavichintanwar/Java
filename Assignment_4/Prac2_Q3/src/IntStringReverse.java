import java.util.Scanner;

public class IntStringReverse {

	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer value: ");
		i = sc.nextInt();
		// String s = Integer.toString(i);  
		String s = String.valueOf(i);
		StringBuffer str = new StringBuffer(s);
	    System.out.println("Buffer string: "+str);
		System.out.println("Reverse of entered integer value: "+str.reverse());
	}

}
