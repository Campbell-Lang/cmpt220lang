package cmpt220;

import java.util.Scanner;

public class Problem7_10 {
		public static void main(String[] args) {	
			Scanner input = new Scanner(System.in);
			
			double[] array = new double [10];
			System.out.print("Type out a list of 10 numbers:");
			for(int i = 0; i < array.length; i++){
				array[i] = input.nextDouble();
			}
			
			System.out.println("The index of the smallest number is: " + indexOfSmallestElement(array));
	}
	

	public static int indexOfSmallestElement(double[] array){
		  int index = 0;
	        double low = array[index];
	        for (int i = 0; i < array.length; i++) {

	            if (low > array[i]) {
	                low = array[i];
	                index = i;
	            }
	        }
	        return index;
	}
}
