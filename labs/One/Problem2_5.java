package cmpt220;

import java.util.Scanner;

public class Problem2_5 {
	public static void main(String[] args)
	{
		double gratuityRate, gratuityTotal, total, subtotal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        
        gratuityTotal = subtotal * gratuityRate * .01;
        
        total = subtotal + gratuityTotal;
        System.out.print("The gratuity is $" + gratuityTotal + " and total is $" + total);
        
        
	}

}
