package cmpt220;

import java.util.Scanner;

public class Problem6_12 {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Type two numbers: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			 printNumbers(num1, num2, 10);
		}

		public static void printNumbers(int num1, int num2, int numberPerLine){
			  for (int count = 1; num1 <= num2; count++, num1++) {

		            System.out.print(num1 + " ");
		            if (count % numberPerLine == 0) System.out.println("");
		}
	}
}
