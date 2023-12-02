import java.util.*;


//Q6) Accept two numbers from user give choice to user,

//a) Supply int data
//b) Supply float data
//c) Supply double data
//and then in each case , try to find min and max value. Also compare two objects numerically and display the result.


public class Choice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1) Supply int data\n2) Supply float data\n3) Supply double data");
		System.out.println("eneter your choice:");
		int choice  = sc.nextInt();
		switch (choice) {
		
		case 1:System.out.println("enter first number:");
			   int n = sc.nextInt();
			   Integer i1 = Integer.valueOf(n);
			   
			   System.out.println("enter Second number:");
			   int m = sc.nextInt();
			   Integer i2 = Integer.valueOf(m);
			   
			   System.out.println("maximum is :"+ Integer.max(n,m));
			   System.out.println("comparision of two objects: "+Integer.compare(i1,i2));
			   
		case 2:System.out.println("enter first number:");
		   float f1 = sc.nextFloat();
		   Float f1_o = Float.valueOf(f1);
		   
		   System.out.println("enter Second number:");
		   float f2 = sc.nextFloat();
		   Float f2_o = Float.valueOf(f2);
		   
		   System.out.println("maximum is :"+ Float.max(f1,f2));
		   System.out.println("comparision of two objects: "+Float.compare(f1_o,f2_o));
		   break;
		
		case 3:System.out.println("enter first number:");
		   float d1 = sc.nextFloat();
		   Double d1_o = Double.valueOf(d1);
		   
		   System.out.println("enter Second number:");
		   float d2 = sc.nextFloat();
		   Double d2_o = Double.valueOf(d2);
		   
		   System.out.println("maximum is :"+ Double.max(d1,d2));
		   System.out.println("comparision of two objects: "+Double.compare(d1_o,d2_o));
		   break;
		   
			
		
		}
	}

}
