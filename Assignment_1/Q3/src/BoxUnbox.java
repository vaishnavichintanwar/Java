import java.util.*;

//Q3) Write Java program to demonstrate Boxing and Unboxing



//a) byte to Byte object

/*public class BoxUnbox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		byte n = sc.nextByte();
		
		Byte obj = Byte.valueOf(n);
		System.out.println("Byte: "+obj);
		
	}

}*/


//b) int to Integer  and Integer to int 

/*
 
	public static void main(String args[]) {
		int n = 10;
		Integer n1 = Integer.valueOf(n);
		System.out.println("integer n1= "+n1);
		System.out.println(n1.intValue());
		
	}
}
*/



//c) float to Float and  Float to float


/*
public class BoxUnbox{
	public static void main(String args[]) {
		float f1 = 11.2f;
		Float f2 = Float.valueOf(f1);
		System.out.println("float f1 :"+f1);
		System.out.println("Float f2:"+f2.floatValue());
		
	}
}

*/



//d) double to Dobule  and Double to double


public class BoxUnbox{
	public static void main(String args[]) {
		double d1 = 11.552d;
		Double d2 = Double.valueOf(d1);
		System.out.println("double d1: "+d1);
		System.out.println("Double d2: "+d2.doubleValue());
	}
}





