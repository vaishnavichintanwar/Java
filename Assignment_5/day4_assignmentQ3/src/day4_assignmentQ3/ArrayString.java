package day4_assignmentQ3;

public class ArrayString {
	public static void main(String args[]) {
		String s1[] = new String[] {"red","blue","black","orange"};;
		String s2[] = new String[] {"red","orange","red"};
		
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
					// break;
				}
			}
		}
		
		
	}
}
