package cmpt220;

import cmpt220.Triangle.IllegalTriangleException;

public class Problem12_5 {
	 public static void main(String[] args) {

	        Triangle t1;
	        try {
	            t1 = new Triangle(1, 1, 2000);
	        } catch (IllegalTriangleException e) {
	            e.printStackTrace();
	        }

	    }
}
