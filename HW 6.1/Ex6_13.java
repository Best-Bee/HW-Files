
public class Ex6_13 {

	public static void main(String[] args) {
		
		System.out.printf("%-10s%-10s","i","m(i)");
		System.out.println();
		System.out.printf("%-20s","-----------------------");
		System.out.println();
		
		for (double i = 1.0; i <= 20.0; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f", sumSeries(i));
			System.out.println();
		}

	}
	
	public static double sumSeries(double num) {
		double sumVal = 0.0;
		for (double i = 1.0; i <= num; i++) {
			sumVal += i / (i + 1.0);
		}
		return sumVal;
	}

}
