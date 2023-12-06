
public class ReverseString {

	public static void main(String[] args) {
		String s = "Sunbeam";
		StringBuffer str = new StringBuffer(s);
		System.out.println("reverse of str: "+str.reverse());
		System.out.println(s.hashCode());
		s.replace("S","s");
		System.out.println(s.hashCode());
		
		
	}

}
