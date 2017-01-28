package cmpt220;

import java.util.Scanner;

public class Problem3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's date: ");
		int day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since then: ");
		int future = input.nextInt();
		int futureDay = (day + future) % 7;
		
		String[] dayConv = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("Today is " + dayConv[day] + " and the future day is " + dayConv[futureDay]);
		
	}

}
