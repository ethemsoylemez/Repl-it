package assignments;

import java.util.Scanner;

public class _085_ShoppingList2 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalProce = 0;
			
			do {
			  System.out.println("Enter Item"+count+ " and its price:");
			  item = scan.next();
			  price = scan.nextDouble();
			  shoppingListReport += "Item"+count+": "+item+" Price: "+price+", ";
			  totalProce += price;
			  System.out.println("Add one more item?");
			  countinue = scan.next();
			  if(!countinue.equals("yes")){
			    break;
			  }
			  count++;
			}while(count<=2);
			System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
			System.out.println("Total price: "+totalProce);
			
			scan.close();
	  }

}
