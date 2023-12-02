import java.util.*;

// Q2) Accept name and mobile number from the user using command line argument and represent mobile number in int format. 


public class Display_info {

	public static void main(String[] args) {
		
		String name = args[0];
//		int mob_no = Integer.parseInt(args[1]);
		long mobile = Long.parseLong(args[1]);
		System.out.println("name: " +name );
//		System.out.println("mob_no: "+mob_no);
		System.out.println("mobile: "+mobile);
	}

}
