
public class menu {

	public static void main(String[] args) 
	{
		double burgers; 
		double soda; 
		double meal;
		double tax = 0.0825;
		double taxAmount;
		double totalWithTax;
		double tipRate = 0.15;
		double tipAmount;
		double totalBill;
		
		//charge and tax 
		
		burgers = 5 * 6.95;
		soda = 4 * 1.75;
		meal = burgers + soda;
		taxAmount = meal*tax;
		totalWithTax = meal + tax;
		tipAmount = totalWithTax * tipRate;
		totalBill = meal + taxAmount + tipAmount;
		
		
		System.out.println("Total meal charge $ "+ meal);
		System.out.println("Tax amount "+ taxAmount);
		System.out.println("Tip amount " + tipAmount);
		System.out.println("Total bill " + totalBill);
	}

}


