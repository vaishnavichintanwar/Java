import java.util.*;

//Q1) Accept one int value from user, and convert it in Integer.

public class Convert {

	public static void main(String[] args) {
		System.out.println("eneter value:");
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Integer n1 = Integer.valueOf(n);
		System.out.println("Integer value:" +n1.intValue());
	}

}
