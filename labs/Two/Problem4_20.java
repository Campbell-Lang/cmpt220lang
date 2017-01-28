package cmpt220;

import java.util.Scanner;

public class Problem4_20 {
		public static void main(String args[]) {
			   Scanner input = new Scanner(System.in);
			   
		        System.out.print("Enter a string: ");
		        String s = input.next();
		        input.close();

		        System.out.println("String: " + s);
		        System.out.println("Length = " + s.length());
		        System.out.println("The first character is: " + s.charAt(0));
		}

}
