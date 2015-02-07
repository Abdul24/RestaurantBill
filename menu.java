
/* Joe and his friends order, at a diner, 5 burgers that cost $6.95 each and 4 sodas that cost $1.75 each.
 The tax is 8.25 percent of the meal charge.
 The tip should be 15 percent of the total after adding the tax.
 Write a program that calculates and displays the following:
 The total meal charge (without the tax and the tip) */

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

