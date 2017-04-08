package cmpt220;

public class Problem12_1 {
	 public static void main(String[] args) {
	  
	        String allInOne = "";
	        for (String arg : args) {
	            allInOne += arg;
	        }
	        
			// JA: Where is class MyString2 declared?
//	        String[] tokens = MyString2.split(allInOne, "[+-*/]");

	        if (args.length != 3) { // JA
	            System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
	            System.exit(0);
	        }

	        int result = 0;

	        try {

	            switch (args[1].charAt(0)) { // JA
	                case '+':
	                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); // JA
	                    break;
	                case '-':
	                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); // JA
	                    break;
	                case '*':
	                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); // JA
	                    break;
	                case '/':
	                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); // JA
	            }
	        } catch (NumberFormatException ex) {
	            System.out.println("ERROR "+ ex.getMessage());
	            System.exit(0);
	        }

	        System.out.println(args[0] + ' ' + args[1] + ' ' 
	                + args[2] + " = " + result); // JA
	    }

	    public static boolean isNumeric(String s) {
	        for (char ch : s.toCharArray()) {
	            if (ch < '0' || ch > '9') return false;
	        }
	        return true;
	    }
}
