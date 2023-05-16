
public class Ex5_25 {

	public static void main(String[] args) {
		
		double total = 0;
		double multiplier = 0;
		
		for (int num = 10000; num <= 100000; num+= 10000) {
			for (int i = 1; i <= num; i+=4) {
				multiplier += (1.0 / i);
			}
			for (int j = 3; j <= num; j+=4) {
				multiplier -= (1.0 / j);
			}
			total = (4 * multiplier);
			System.out.println("The result of " + num + " is " + total);
			total = 0;
			multiplier = 0;
		}
		

	}

}
