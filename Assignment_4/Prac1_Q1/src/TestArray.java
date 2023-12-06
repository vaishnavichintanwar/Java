import java.util.Scanner;

public class TestArray 
{

	public static void main(String[] args) 
	{	
		int m,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size of the array: ");
		m = sc.nextInt();
		
		System.out.println("Enter column size of the array: ");
		n = sc.nextInt();
		System.out.println("enter array elements: ");
		int arr [][] = new int[m][n];
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Your 2D array is: ");
		System.out.println();
		
		for(int row[]:arr) {
			for(int ele:row) {
				System.out.print(ele+"\t");
			}
			System.out.println();
		}
		
	}
		
}	