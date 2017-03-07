package cmpt220;

public class Location {
	public double maxValue;
	public int row;
	public int column;
	
	public Location() {
		
	}
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	
	public static Location locateLargest(double[][] m) {
		double maxValue = m[0][0];
		int row = 0;
		int column = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (maxValue < m[i][j]) {
                    maxValue = m[i][j];
                    row = i;
                    column = j;
                }
            }
        }
		return new Location(row, column, maxValue);
		   
	}
		   

	

}
