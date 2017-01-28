package cmpt220;

import java.util.Scanner;

public class Problem4_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String ch = input.next();
		
		switch(ch.toLowerCase()) 
		{
		case "a": 
		case "e":
		case "i": 
		case "o": 
		case "u": System.out.println(ch + " is a vowel!");
			break;
		case "q" :		
		case "w" :
		case "r" :		
		case "t" :		
		case "y" :		
		case "p" :		
		case "s" :		
		case "d" :		
		case "f" :		
		case "g" :	
		case "h" :	
		case "j" :	
		case "k" :	
		case "l" :	
		case "m" :	
		case "n" :	
		case "b" :	
		case "v" :	
		case "c" :	
		case "x" :	
		case "z" :	System.out.println(ch + " is a consanant!");
			break;
		default: System.out.println("Invalid answer.");
		}
	}

}
