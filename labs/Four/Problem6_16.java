package cmpt220;

import java.util.Scanner;

public class Problem6_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter year 
		System.out.print("Enter full year (e.g. 2016): ");
		int year = input.nextInt();
		// JA: Yopu had to print all the years from 2000 to 2020
		System.out.print("The number of days this year is: " + getTotalNumberOfDays(year));

	}
	
	public static int getTotalNumberOfDays(int year) {
		int total = 0;
		
		//get the total days from 1800 to 1/1/year {
			if(isLeapYear(year))
				total = 366;
			else 
				total = 365;
			return total;
		}
		
		
	
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

}
