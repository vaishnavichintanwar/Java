// Q3) write a java program to count number of words in a String.
import java.util.*;

public class CountChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("enter a String: ");
		s = sc.nextLine();
	    String arr[];
	    
	    System.out.println("string : "+s);
	    String ch[] = s.split(" ");
	    System.out.println("count of words: "+ch.length);
	    
	    
	    System.out.println("*************** 2nd way ******************");
	    
	    StringTokenizer s2 = new StringTokenizer(s);
	    System.out.println("count of words: "+s2.countTokens());
	    
	
	    
	    
	    
	}

}
