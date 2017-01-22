package cmpt220;

import java.util.Scanner;

public class Problem2_6 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int amount = input.nextInt();
		
		int firstNumber = amount % 10;
        int remainingNumber = amount / 10;
        int SecondNumber = remainingNumber % 10;
         remainingNumber = remainingNumber / 10;
        int thirdNumber = remainingNumber % 10;
        int sum = thirdNumber + SecondNumber + firstNumber;

        System.out.println("The sum of all digits in " + amount + " is " + sum);
	}

}
