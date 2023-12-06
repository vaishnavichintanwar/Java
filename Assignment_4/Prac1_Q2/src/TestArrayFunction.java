import java.util.Scanner;

public class TestArrayFunction 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void accept(int arr[][]) {
		
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[0].length;j++) 
			{
				arr[i][j] = sc.nextInt();
			}
			
		}
	}
	
	public static void display(int arr[][]) {
		System.out.println("Your 2D array is: ");
		System.out.println();
		
		for(int row[]:arr) {
			for(int ele:row) {
				System.out.print(ele+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) 
	{	
		int m;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter row size of the array: ");
		m = sc.nextInt();
		
		System.out.println("Enter column size of the array: ");
		n = sc.nextInt();
		
		
		
		int arr [][] = new int[m][n];
		
		accept(arr);
		display(arr);
			
	}
		
}	