import java.util.*;

// Q8) accept one value from user, and it Returns true if 
// is a Not-a-Number (NaN) 
// else it should return false otherwise.

public class IsNAN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value: ");
		float f = sc.nextFloat();
		Boolean b = Float.isNaN(f);
		System.out.println(b);
	}

}
