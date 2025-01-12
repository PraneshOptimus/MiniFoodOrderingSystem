import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		double total = 0;
		double quantity=0;
		while(flag)
		{
			System.out.println("Welcome To Shopping Cart !");
			System.out.println("\nAvailable Foods : ");
			System.out.println();
			System.out.println("1) Biriyani - Rs.110/-");
			System.out.println("2) Burger - Rs.99/-");
			System.out.println("3) Pizza - Rs.199/-");
			System.out.println("4) Chicken Rice - Rs.80/-");
			System.out.println("5) Dosa (set)  - Rs/20-");
			System.out.println("6) Chicken Noodles - Rs.70/-");
			System.out.println("7) Parotta - Rs.20/-");
			System.out.println("8) Chicken Shawarma - Rs.90/-");
			System.out.println();
			System.out.println("9) Checkout");
			System.out.println();
			System.out.print("Enter the Option : ");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1 :
			System.out.println("\nYou Selected Biriyani !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*110);
			System.out.println("Your Price is : "+total);
			break;
		
		case 2:
			System.out.println("\nYou Selected Burger !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*99);
			System.out.println("Your Price is : "+total);
			break;
		case 3:
			System.out.println("\nYou Selected Pizza !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*199);
			System.out.println("Your Price is : "+total);
			break;
		case 4:
			System.out.println("\nYou Selected Chicken Rice !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*80);
			System.out.println("Your Price is : "+total);
			break;
		case 5:
			System.out.println("\nYou Selected Dosa !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*20);
			System.out.println("Your Price is : "+total);
			break;
		case 6:
			System.out.println("\nYou Selected Chicken Noodles !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*70);
			System.out.println("Your Price is : "+total);
			break;
		case 7:
			System.out.println("\nYou Selected Parotta !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*20);
			System.out.println("Your Price is : "+total);
			break;
		case 8:
			System.out.println("\nYou Selected Chicken Shawarma !");
			System.out.print("Enter How Much Quantity You Want ? ");
			quantity = sc.nextInt();
			total += (quantity*90);
			System.out.println("Your Price is : "+total);
			break;
		case 9:
			System.out.println("Thank you for Ordering and Your Total Price is :  "+total);
			flag = false;
			break;
		default : 
			System.out.println("No Available options");
			flag = false;
		}
		}

	}

}
