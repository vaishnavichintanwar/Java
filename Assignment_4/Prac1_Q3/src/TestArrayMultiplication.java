import java.util.Scanner;

public class TestArrayMultiplication 
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
		//System.out.println("Your 2D array is: ");
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
		int m,n;
	
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter row size of the array: ");
		m = sc.nextInt();
		
		System.out.println("Enter column size of the array: ");
		n = sc.nextInt();
		
		
		
		int arr1 [][] = new int[m][n];
		int arr2 [][] = new int[m][n];
		int arr3 [][] = new int[m][n];
		
		
	    accept(arr1);
		accept(arr2);
		
		for(int i =0;i<m;i++) 
		{
			for(int j=0;j<n;j++) {
				arr3[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		
		System.out.println("First Array: ");
		display(arr1);
		System.out.println("Second Array: ");
		display(arr2);
		
		System.out.println("Multiplication of 2 Arrays: ");
		display(arr3);
		
		
		
	}
		
}	