import java.util.Scanner;
import java.util.ArrayList;

public class GoGroceryShopping
{
	public static void main(String []args)
	{
		Scanner input = new Scanner (System.in);
		Scanner in = new Scanner (System.in);
		Scanner put = new Scanner (System.in);
		String name;
		double cost;
		int num;
		double sum = 0.0;

		GroceryList slist = new GroceryList();
		for(int i = 1; i<=4; i++)
		{
			System.out.println("What is item number "+i+" on your list?");
			name = in.nextLine();
			System.out.println("How many of them do you need?");
			num = input.nextInt();
			System.out.println("How much does it cost?");
			cost = put.nextDouble();
			GroceryItem item = new GroceryItem(name, cost);
			slist.addItem(item,num);
			item.updatePrice(cost);
			item.getName(name);
			sum+=num*cost;
		}

		slist.printList();
		System.out.printf("$%.2f",slist.totalCost(sum));
	}
}
