
public class StringOperation {

	public static void main(String[] args) {
		String s = "Sunbeam";
		String s2 = "DBDA";
		
		StringBuffer s3 = new StringBuffer(s2);
		String s4 = "";
		char dest[] =new char[20];
		// System.out.println("s3: "+s3);
		
		System.out.println("Operations on s: Sunbeam");
		System.out.println();
		System.out.println("sunbeam Length : "+s.length());
		System.out.println("char at 2: "+s.charAt(2));
		System.out.println("contains S: "+s.contains("S"));
		System.out.println("contains am: "+s.contains("am"));
		System.out.println("indexOf m: "+s.indexOf('m'));
		System.out.println("s isEmpty: "+s.isEmpty());
		System.out.println("s4 isEmpty: "+s4.isEmpty());
		System.out.println("LastindexOf n: "+s.lastIndexOf("n"));
		System.out.println("LastindexOf Vaishnavi: i: "+"Vaishnavi".lastIndexOf("i"));
		System.out.println("Replace S by s: "+s.replace('S', 's'));
		System.out.println("substring(0,3) :"+s.substring(0, 3));
		System.out.println("lowercase: "+s.toLowerCase());
		System.out.println("uppercase: "+s.toUpperCase());
		System.out.println("equals s2 and s3: "+s2.equals(s3));
		System.out.println("equals s2 and s3: "+s2.contentEquals(s3));
		
		
		 
        char[] destArray = new char[20];
        try {
            s.getChars(0,5, destArray, 0);
            System.out.println(destArray);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
		
	}

}
