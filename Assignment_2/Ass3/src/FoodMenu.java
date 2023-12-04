// Display food menu to user. User will select items from menu along with the
// quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
// prices to food items(hard code the prices) When user enters 'Generate Bill'
// option , display total bill & exit

import java.util.*;




public class FoodMenu {
	
	static int bill  = 0;

	public static void main(String[] args) 
	{
		System.out.println("1)Samosa\n2)Dosa\n3)Idli\n4)Noodles\n5)Soup\n6)Salad\n7)Tea\n8)Coffee\n9)Dhokala\n10)Generate Bill");
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		while(ch!=10) 
		{
			System.out.println("enter choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 0: System.out.println("welcome");
						break;
						
				case 1: 
					    System.out.println("Welcome you have selected Samosa");
						int price = 10;
						System.out.println("eneter quantity : ");
						int n = sc.nextInt();
						bill = bill+(price * n);
						break; 
						
				case 2: System.out.println("Welcome you have selected Dosa");
						int price2 = 30;
						System.out.println("eneter quantity : ");
						int n2 = sc.nextInt();
						bill = bill+(price2 * n2);
						break; 
						
				case 3: System.out.println("Welcome you have selected Idali");
						int price3 = 50;
						System.out.println("eneter quantity : ");
						int n3 = sc.nextInt();
						bill = bill+(price3 * n3);
						break;
						
				case 4: 
					    System.out.println("Welcome you have selected Noodles");
						int price4 = 100;
						System.out.println("eneter quantity : ");
						int n4 = sc.nextInt();
						bill = bill+(price4 * n4);
						break; 
						
				case 5: System.out.println("Welcome you have selected Soup");
						int price5 = 100;
						System.out.println("eneter quantity : ");
						int n5 = sc.nextInt();
						bill = bill+(price5 * n5);
						break; 
						
				case 6: System.out.println("Welcome you have selected Salad");
						int price6 = 200;
						System.out.println("eneter quantity : ");
						int n6 = sc.nextInt();
						bill = bill+(price6 * n6);
						break; 
						
				case 7: System.out.println("Welcome you have selected Tea");
						int price7 = 50;
						System.out.println("eneter quantity : ");
						int n7 = sc.nextInt();
						bill = bill+(price7 * n7);
						break; 
						
				case 8: 
					    System.out.println("Welcome you have selected Coffee");
						int price8 = 70;
						System.out.println("eneter quantity : ");
						int n8 = sc.nextInt();
						bill = bill+(price8 * n8);
						break; 
						
				case 9: System.out.println("Welcome you have selected Dhokala");
						int price9 = 80;
						System.out.println("eneter quantity : ");
						int n9 = sc.nextInt();
						bill = bill+(price9 * n9);
						break;		
										
				case 10:
						System.out.println("bill = "+bill);
						System.out.println("exit");
						break;
							
			}
		}
		
		
	}
}