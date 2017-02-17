package cmpt220;
// JA: The problem was feet to meters
public class Problem6_9 {
	public static void main(String[] args) {
		String pound = "Pound";
        String kilogram = "kilogram";
        System.out.printf("%5s%10s | %5s%9s\n", kilogram, pound, pound, kilogram);
        for (double kilograms = 20, pounds = 1; kilograms <= 200; kilograms+=5, pounds++) {

            System.out.printf("%5.2f%10.2f | %5.2f%10.2f\n", pounds, poundToKilogram(pounds),
                    kilograms, kilogramToPound(kilograms));


        }
    }

    /** Convert from feet to meters */
    public static double poundToKilogram(double pounds) {
        return  2.204 * pounds;
    }

    /** Convert from meters to feet */
    public static double kilogramToPound(double kilograms) {
        return 0.453 * kilograms;
	}
}
