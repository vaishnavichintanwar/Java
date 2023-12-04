// Accept 2 double values from User (using Scanner). Check data type. If
// arguments are not doubles, supply suitable error message & terminate.
// If numbers are double values, print its average.

import java.util.*;

public class Average 
{
		public static void main(String args[])
		{
			double var1,var2;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter double var1: ");
			var1 = sc.nextDouble();
			
			System.out.println("Enter double var2: ");
			var2 = sc.nextDouble();
			
			System.out.println("var1 : "+var1 +" var2 : "+var2);
			System.out.println("type of "+var1+ " is: "+((Object)var1).getClass().getSimpleName());
			System.out.println("type of "+var2+ " is: "+((Object)var2).getClass().getSimpleName());
			
			double average = (var1+var2)/2;
			System.out.println("average of "+var1+ " & "+var2+" is : "+average);
		}
}


